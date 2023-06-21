package multithreading;

public class ImplementSynchronization {

    private int availableSeats;

    public ImplementSynchronization(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public synchronized void bookTicket(int numSeats, String customerName) {
        if (numSeats <= availableSeats) {
            System.out.println("Booking " + numSeats + " ticket(s) for " + customerName);
            availableSeats -= numSeats;
            System.out.println("Booking successful for " + customerName + ". Remaining seats: " + availableSeats);
        } else {
            System.out.println("Insufficient seats available for " + customerName);
        }
    }

    public static void main(String[] args) {
    	ImplementSynchronization bookingSystem = new ImplementSynchronization(10);

        Runnable b1 = () -> bookingSystem.bookTicket(2, "Amy");
        Runnable b2 = () -> bookingSystem.bookTicket(4, "Cary");
        Runnable b3 = () -> bookingSystem.bookTicket(3, "Dan");
        Runnable b4 = () -> bookingSystem.bookTicket(5, "Alex");

        Thread t1 = new Thread(b1);
        Thread t2 = new Thread(b2);
        Thread t3 = new Thread(b3);
        Thread t4 = new Thread(b4);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}