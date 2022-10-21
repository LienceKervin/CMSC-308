import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Boolean flag = true;
        double x, y;

        do {
            Scanner scan = new Scanner(System.in);

            System.out.println("CALCULATOR");
            System.out.println("[1] Addition");
            System.out.println("[2] Subtraction");
            System.out.println("[3] Multiplication");
            System.out.println("[4] Division");
            System.out.println("[5] Quit \n");
            System.out.print("Enter choice [1-5]:");

            try {

                switch (scan.nextInt()) {
                    case 1:
                        System.out.println("Enter Augend: ");
                        x = scan.nextDouble();
                        System.out.println("Enter Addend: ");
                        y = scan.nextDouble();

                        System.out.println(addition(x, y));
                        break;

                    case 2:
                        System.out.println("Enter Minuend: ");
                        x = scan.nextDouble();
                        System.out.println("Enter Subtrahend: ");
                        y = scan.nextDouble();

                        System.out.println(subtraction(x, y));
                        break;

                    case 3:
                        System.out.println("Enter Multiplicand: ");
                        x = scan.nextDouble();
                        System.out.println("Enter Multiplier: ");
                        y = scan.nextDouble();

                        System.out.println(multiplication(x, y));
                        break;

                    case 4:
                        System.out.println("Enter Dividend: ");
                        x = scan.nextDouble();
                        System.out.println("Enter Divisor: ");
                        y = scan.nextDouble();

                        System.out.println(division(x, y));
                        break;

                    case 5:
                        System.out.println("Quit");
                        flag = false;
                        scan.close();
                        break;
                    default:
                        System.out.println("Enter num 1-5");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("invalid input");
                System.out.println(e);
            }

        } while (flag == true);
    }

    public static String addition(double x, double y) {
        double sum = x + y;
        String result = String.format("The sum of %s and %s is %s", x, y, sum);
        return result;
    }

    public static String subtraction(double x, double y) {
        double diff = x - y;
        String result = String.format("The difference of %s and %s is %s", x, y, diff);
        return result;
    }

    public static String multiplication(double x, double y) {
        double prod = x * y;
        String result = String.format("The product of %s and %s is %s", x, y, prod);
        return result;
    }

    public static String division(double x, double y) {
        double quot = x / y;
        String result = String.format("The quotient of %s and %s is %s", x, y, quot);
        return result;
    }

    public static String exponent(double x, double y) {
        double pow = Math.pow(x, y);
        String result = String.format("%s raise to %s is %s", x, y, pow);
        return result;
    }

    public static String modulo(double x, double y) {
        double rem = x % y;
        String result = String.format("The remainder of %s and %s is %s", x, y, rem);
        return result;
    }
}