public class PerfectNumber {

    public static void main(String[] args) {

        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
        System.out.println(isPerfectNumber(496));
        System.out.println(isPerfectNumber(8128));
        System.out.println(isPerfectNumber(33550336));


    }

    public static boolean isPerfectNumber (int number) {

        int sum = 0;
        if (number < 0) {
            return false;
        }

        for (int i = 1; i <= number; i++) {
            if (number%i == 0) {
                sum = sum+i;
            }
            if (sum == number) {
                return true;
            }
        }
        return false;
    }

}
