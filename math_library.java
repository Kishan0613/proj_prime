import java.util.Scanner;

public class math_library {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        double sqrtResult = Math.sqrt(number);
        System.out.println("Square Root: " + sqrtResult);

        double absResult = Math.abs(number);
        System.out.println("Absolute Value: " + absResult);

        double logResult = Math.log10(number);
        System.out.println("Logarithm (base 10): " + logResult);

        double cosResult = Math.cos(number);
        System.out.println("Cosine: " + cosResult);

        double expResult = Math.exp(number);
        System.out.println("Exponentiation (e^x): " + expResult);

        long roundResult = Math.round(number);
        System.out.println("Rounded to the Nearest Integer: " + roundResult);

        scanner.close();
    }
}
