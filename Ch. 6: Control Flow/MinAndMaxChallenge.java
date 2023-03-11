import java.util.Scanner;

public class MinAndMaxChallenge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean validInput = true;
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;

        do {
            try {
                System.out.println("Enter a real number to be checked, or any other character to quit:");
                double number = Double.parseDouble(scanner.nextLine());
                if (number < min) {
                    min = number;
                }
                if (number > max) {
                    max = number;
                }
                System.out.println("Current min number: " + min);
                System.out.println("Current max number: " + max);
            } catch (NumberFormatException badUserData) {
                System.out.println("Character entered, quitting program.");
                validInput = false;
            }

        } while (validInput);
    }
}
