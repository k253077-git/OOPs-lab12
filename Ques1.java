public class Ques1 {
    public static void main(String[] args) {

        String[] list = {"10", "20", "abc", "30"};

        int sum = 0;
        int count = 0;

        try {
            // Check null or empty
            if (list == null || list.length == 0) {
                throw new Exception("List is null or empty");
            }
            for (int i = 0; i < list.length; i++) {
                try {
                    int num = Integer.parseInt(list[i]);
                    sum += num;
                    count++;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid value skipped: " + list[i]);
                }
            }
            if (count == 0) {
                throw new Exception("All values are invalid");
            }
            double avg = (double) sum / count;
            System.out.println("Average = " + avg);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}