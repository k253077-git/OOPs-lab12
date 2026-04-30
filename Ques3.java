import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            String input1 = sc.nextLine();

            System.out.print("Enter second number: ");
            String input2 = sc.nextLine();

            // Check empty
            if (input1 == null || input1.isEmpty() ||
                    input2 == null || input2.isEmpty()) {
                throw new Exception("Input cannot be empty");
            }
            double num1 = Double.parseDouble(input1);
            double num2 = Double.parseDouble(input2);

            System.out.print("Enter operation (+, -, *, /): ");
            char op = sc.next().charAt(0);

            double result = 0;
            switch (op) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        throw new ArithmeticException("Cannot divide by zero");
                    }
                    result = num1 / num2;
                    break;

                default:
                    throw new Exception("Invalid operator");
            }
            System.out.println("Result = " + result);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number input");

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}