package exceptions;

public class ExceptionHandling {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
//            System.out.println(divide(a,b));
//            System.out.println(a / b);
            throw new CustomException("Custom Exception");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Runtime Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("This will always run");
        }
        //Good practice to use finally block and multiple catch blocks
    }
    static int divide(int a, int b) throws ArithmeticException {
        if(b==0){
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a/b;
    }
}
