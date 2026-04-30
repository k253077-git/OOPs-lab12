import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        try {

            if (input == null || input.trim().isEmpty()) {
                throw new Exception("Input is empty");
            }

            String[] words = input.trim().split("\\s+");

            if (words.length < 2) {
                throw new Exception("Sentence must contain at least two words");
            }

            String result = "";
            for (int i = words.length - 1; i >= 0; i--) {
                result = result + words[i] + " ";
            }
            System.out.println("Modified sentence: " + result.trim());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}