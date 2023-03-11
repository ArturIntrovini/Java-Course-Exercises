public class LargestPrime {

    public static void main(String[] args) {

        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));

    }

    public static int getLargestPrime (int number) {
        int largestPrimeFactor = -1;
        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                if (isPrime(i)) {
                    largestPrimeFactor = i;
                }
                number /= i;
            }
        }
        return largestPrimeFactor;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
