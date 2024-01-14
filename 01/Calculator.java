import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give number 1: ");
        double number1 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("give operator (+,-,*,/): ");
        String operator = scanner.nextLine();
        System.out.println("give number 2: ");
        double number2 = scanner.nextDouble();
        if (operator.equals("/") && number2 == 0) {
            System.out.println("Error: Division by zero is not allowed.");
        } else {
            double result = calculate(number1, operator, number2);
            System.out.println("Result: " + result);
        }
    }
    
public static double calculate(double number1, String operator, double number2){
    switch (operator) {
        case "+":
            return number1 + number2;
        case "-":
            return number1 - number2;
        case "*":
            return number1 * number2;
        case "/":
            return number1 / number2;
        default:
            System.out.println("Invalid operator.");
            return 0;
    }
}
}