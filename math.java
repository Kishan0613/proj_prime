import java.util.Scanner;

public class math{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        double squareResult = square(number);
        System.out.println("Square: " + squareResult);

        double cubeResult = cube(number);
        System.out.println("Cube: " + cubeResult);

        System.out.print("Enter a divisor for modulus: ");
        double divisor = scanner.nextDouble();
        double modulusResult = modulus(number, divisor);
        System.out.println("Modulus: " + modulusResult);

        System.out.print("Enter the exponent for power: ");
        double exponent = scanner.nextDouble();
        double powerResult = power(number, exponent);
        System.out.println("Power: " + powerResult);

        scanner.close();
    }

    public static double square(double num) {
        return num * num;
    }

    public static double cube(double num) {
        return num * num * num;
    }

    public static double modulus(double dividend, double divisor) {
        return dividend % divisor;
    }

    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}