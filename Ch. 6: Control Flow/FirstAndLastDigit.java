public class FirstAndLastDigit {

        public static void main(String[] args) {
            
            System.out.println(isPalindrome(252));
            System.out.println(isPalindrome(257));
            System.out.println(isPalindrome(123456789));
            System.out.println(isPalindrome(5));
            System.out.println(isPalindrome(-1));

        }

        public static int isPalindrome (int number) {

            if (number <0) {
                return -1;
            } else if (number < 10){
                return number * 2;
            }

            int firstDigit = 0;
            int lastDigit = number%10;

             do {
                firstDigit = number/10;
                number = number/10;
            } while (Math.abs(number) > 9);
            return firstDigit + lastDigit;
        }
}