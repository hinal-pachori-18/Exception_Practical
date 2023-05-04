public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Enter's in try block ");
            int a = 100, b = 0, c;
            c = a / b;
            System.out.println("Value of c : " + c);
        }
        catch (ArithmeticException e) {
            System.out.println("Caught the exception " + e);
        }
        catch (Exception e) {
            System.out.println(e);
        }
        finally {
            System.out.println("Finally block should be execute with or without error");
        }
        System.out.println("rest of code....");
    }
}