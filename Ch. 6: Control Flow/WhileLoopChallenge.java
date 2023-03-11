public class WhileLoopChallenge {

    public static void main(String[] args) {

        int number = 4;
        int finishNumber = 20;
        int countEven = 0;
        int countOdd = 0;
        while (number <= finishNumber) {
            number++;
            if (isEvenNumber(number)) {
                System.out.println("Even number found: " + number);
                countEven++;
            } else countOdd++;
            if (countEven  >= 5) {
                break;
            }
        }
        System.out.println("Job complete. The amount of even numbers found was " + countEven + " and the amount of odd numbers was " + countOdd + ".");

    }

    public static boolean isEvenNumber (int number) {
        return (number % 2 == 0);
    }

}