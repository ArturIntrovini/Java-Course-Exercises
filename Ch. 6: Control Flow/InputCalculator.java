import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {

        System.out.println("Keep adding real numbers to get their sum and average. Input anything else to stop.");
        inputThenPrintSumAndAverage();

    }

    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);
        int count = 0;
        double sum = 0;
        double avg = 0;
        double number = 0;

        do {
            try {
                number = Double.parseDouble(scanner.nextLine());
                count++;
                sum = sum + number;
                avg = sum/(double)count;
            }catch(NumberFormatException badUserData){
                System.out.println("Character entered, quitting program.");
                break;
            }
        } while (true);
        System.out.println("SUM = " + sum + ", AVG = " + avg);
    }

}
