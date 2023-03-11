public class Sum3And5Challenge {

    public static void main(String[] args) {

        int sum = 0;
        int count = 0;

        for (int i = 368; i <= 1000; i++ ) {
            if(i%3 == 0 && i%5 == 0) {
                System.out.println("The number " + i + " is divisible by both 3 and 5.");
                sum = sum + i;
                count++;
            }
            if (count == 5) {
                break;
            }
        }

        System.out.println("The sum of all five numbers divisible by both 3 and 5 is " + sum + ".");

    }

}
