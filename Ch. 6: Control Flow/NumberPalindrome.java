public class NumberPalindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));

    }

    public static boolean isPalindrome (int number) {

        int calcNumber = number;
        int reverse = 0;
        int lastDigit;

        while (Math.abs(calcNumber) > 0) {

            lastDigit = calcNumber % 10;
            reverse = reverse + lastDigit;
            calcNumber = calcNumber / 10;
            reverse = reverse * 10;
        }
        reverse = reverse / 10;
        return reverse == number;
    }
}