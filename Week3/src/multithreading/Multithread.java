package multithreading;

import java.util.Arrays;

public class Multithread {
    private static int[] arr = new int[100];
    private static int[] partialSums = new int[5];

    public static void main(String[] args) throws InterruptedException {
        
        for (int i = 0; i < 100; i++) {
            arr[i] = i + 1;
        }

        // Create and start 5 threads to calculate partial sums
        SumCalculator[] sc = new SumCalculator[5];
        Thread[] threads = new Thread[5];
        for (int i = 0; i < 5; i++) {
            sc[i] = new SumCalculator(i * 20, (i + 1) * 20);
            threads[i] = new Thread(sc[i]);
            threads[i].start();
        }

        // Wait for all threads to complete
        for (int i = 0; i < 5; i++) {
            threads[i].join();
        }

        // Combine partial sums to get the final sum
        int finalSum = Arrays.stream(partialSums).sum();
        System.out.println("The sum of elements in the array is: " + finalSum);
    }

    static class SumCalculator implements Runnable {
        private int startIndex;
        private int endIndex;

        public SumCalculator(int startIndex, int endIndex) {
            this.startIndex = startIndex;
            this.endIndex = endIndex;
        }

        @Override
        public void run() {
            int sum = 0;
            for (int i = startIndex; i < endIndex; i++) {
                sum += arr[i];
            }
            partialSums[startIndex / 20] = sum;
        }
    }
}
