public class NumberToWords {

    public static void main(String[] args) {

        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(-12));
        System.out.println(getDigitCount(5200));
        System.out.println();
        System.out.println(reverse(-121));
        System.out.println(reverse(1212));
        System.out.println(reverse(1234));
        System.out.println(reverse(100));
        System.out.println();
        numberToWords(123);
        System.out.println();
        numberToWords(1010);
        System.out.println();
        numberToWords(1000);
        System.out.println();
        numberToWords(-12);

    }

    public static void numberToWords (int number) {

        int lastDigit = 0;
        int calculatedNumber = reverse(number);
        String s = "null";

        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        for (int i = 0; i < (getDigitCount(number)); i++) {

            lastDigit = calculatedNumber%10;

            switch (lastDigit) {
                case 0 -> s = "ZERO";
                case 1 -> s = "ONE";
                case 2 -> s = "TWO";
                case 3 -> s = "THREE";
                case 4 -> s = "FOUR";
                case 5 -> s = "FIVE";
                case 6 -> s = "SIX";
                case 7 -> s = "SEVEN";
                case 8 -> s = "EIGHT";
                case 9 -> s = "NINE";
            }
            System.out.print(s + " ");
            calculatedNumber = calculatedNumber/10;

        }
    }

    public static int reverse (int number) {

        int calculatedNumber = number;
        int reversedNumber = 0;
        int lastDigit = 0;

        if (getDigitCount(number) == 1) {
            return reversedNumber = number;
        }

        if (number < 0) {
                        calculatedNumber = Math.abs(number);
            for (int i = 0; i < (getDigitCount(Math.abs(number))); i++) {
                lastDigit = calculatedNumber%10;
                reversedNumber = reversedNumber*10 + lastDigit;
                calculatedNumber = calculatedNumber/10;
            }
            return reversedNumber*-1;
        }

        for (int i = 0; i < (getDigitCount(number)); i++) {
            lastDigit = calculatedNumber%10;
            reversedNumber = reversedNumber*10 + lastDigit;
            calculatedNumber = calculatedNumber/10;
        }
        return reversedNumber;

    }

    public static int getDigitCount (int number) {

        if (number < 0) {
            return -1;
        }

        int digitCount = 1;
        while ((number/10) > 0) {
            digitCount++;
            number = number/10;
        }
        return digitCount;
    }

}
