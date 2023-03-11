import java.util.Scanner;

public class ReadingUserInputChallenge {

    public static void main(String[] args) {

        System.out.println("Hello, give me 5 numbers and I will sum them for you:");
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int nextNumber = 0;

        for (int i = 1; i <= 5; i++){
            boolean validInput = false;
            do {
                try {
                    System.out.println("Enter number #" + i);
                    nextNumber = Integer.parseInt(scanner.nextLine());
                    validInput = true;
                } catch (NumberFormatException badUserData) {
                    System.out.println("Characters not Allowed!");
                }
            } while (!validInput);
            sum = sum + nextNumber;
        }

        System.out.println("The sum of the 5 numbers typed is: " + sum);

    }

}
