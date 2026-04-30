import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = sc.nextLine();

        try {
            if (input == null || input.isEmpty()) {
                throw new Exception("Input is empty");
            }

            int n = Integer.parseInt(input);
            if (n < 0) {
                throw new Exception("Number cannot be negative");
            }

            long fact = 1;
            for (int i = 1; i <= n; i++) {
                fact = fact * i;

                if (fact < 0) {
                    throw new Exception("Number is large");
                }
            }
            System.out.println("Factorial = " + fact);

        } catch (NumberFormatException e) {
            System.out.println("Invalid input");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}