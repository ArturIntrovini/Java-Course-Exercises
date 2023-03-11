public class DigitSumChallenge {

    public static void main(String[] args) {

        System.out.println(sumDigits(1991));
        System.out.println(sumDigits(89));
        System.out.println(sumDigits(9));

    }

    public static int sumDigits (int number) {

        int sumOfDigits = 0;
        int singleDigit = 0;
        int newNumber = 0;
        if (number < 0 || number > 9999) {
            return -1;
        }

        newNumber = number;
        for (int i = 1000; i > 0; i /= 10) {
            if (i > number) {
                continue;
            }
            singleDigit = newNumber/i;
            sumOfDigits += singleDigit;
            newNumber = newNumber%i;
        }
        return sumOfDigits;
    }

}
