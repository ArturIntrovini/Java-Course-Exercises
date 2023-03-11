public class EvenDigitSum {

    public static void main(String[] args) {

        System.out.println(getEvenNumberSum(123456789));
        System.out.println(getEvenNumberSum(252));
        System.out.println(getEvenNumberSum(-22));

    }

    public static int getEvenNumberSum (int number) {

        if (number < 0) {
            return -1;
        }

        int evenSum = 0;

        while((Math.abs(number) > 0)) {
            if ((number%10)%2 == 0) {
                evenSum = evenSum + number%10;
            }
            number = number/10;
        }
        return evenSum;
    }

}
