import java.util.Scanner;

class Calculator {


    public double calculate(double a, double b, String operation) {

        switch (operation.toLowerCase()) {
            case "add":
            case "+":
                return a + b;

            case "sub":
            case "-":
                return a - b;

            case "mul":
            case "*":
                return a * b;

            case "div":
            case "/":
                if (b == 0) {
                    System.out.println("Error: Division by zero is not allowed!");
                    return 0;
                }
                return a / b;

            default:
                System.out.println("Invalid Operation!");
                return 0;
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value for a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value for b: ");
        double b = sc.nextDouble();

        System.out.print("Enter operation (add, sub, mul, div): ");
        String op = sc.next();

        Calculator calc = new Calculator();

        double result = calc.calculate(a, b, op);

        System.out.println("Result: " + result);

        sc.close();
    }
}
