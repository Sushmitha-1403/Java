package d06122023;

public class CustException {
    public static void main(String[] args) {
        int f1 = 6;
        int s1 = 0;
        try {
            int result = f1 / s1;
        } catch (ArithmeticException ae) {
            try {
                throwCustException(ae);
            } catch (CustExample e) {
                System.out.println("exception: " + e.getMessage());
            }
        }
    }

    public static void throwCustException(ArithmeticException ae) throws CustExample {
        throw new CustExample("" + ae.getMessage());
    }
}
