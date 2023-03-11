public class LastDigitChecker {

    public static void main(String[] args) {

        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));

    }

    public static boolean hasSameLastDigit (int numOne, int numTwo, int numThree) {

        int comparisonOne = 0;
        int comparisonTwo = 0;
        int comparisonThree = 0;

        if ((numOne < 10 || numOne > 1000) || (numTwo < 10 || numTwo > 1000) || (numThree < 10 || numThree > 1000)) {
            return false;
        }

        comparisonOne = numOne%10;
        comparisonTwo = numTwo%10;
        comparisonThree = numThree%10;

        if (comparisonOne == comparisonTwo || comparisonOne == comparisonThree || comparisonTwo == comparisonThree) {
            return true;
        } return false;

    }

}
