package _03_exception._02_procesing;

public class Factorial {
    public static int getFactorial(int number) {
        int result = 0;
        try {
            if (number < 0) {
                throw new IllegalArgumentException("Number must be more than 0.");
            }
            result = 1;
            for (int i = 1; i <= number; i++) {
                result *= i;
            }
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
        return result;
    }
}
