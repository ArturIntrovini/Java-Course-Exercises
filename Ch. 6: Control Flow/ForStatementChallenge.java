public class ForStatementChallenge {

    public static void main(String[] args) {
        primeCounter(382);
    }

    public static boolean isPrime (int wholeNumber) {
        if (wholeNumber <= 2 ) {
            return (wholeNumber == 2);
        }
        for (int divisor = 2; divisor <= (wholeNumber/2); divisor++) {
            if (wholeNumber%divisor == 0) {
                return false;
            }
        }
        return true;
    }

    public static int primeCounter (int startingNumber) {

        int counter = 0;
        System.out.println("Starting from " + startingNumber + ":");
        for (int i = startingNumber + 1; i <= 1000; i++ ) {
            if (isPrime(i)){
                counter++;
                System.out.println("The most recent prime found was: " + i + " and the total primes so far is: " + counter);
            }
            if (counter == 3) {
                System.out.println("Third prime number found. Job is done.");
                break;
            }
        } return 0;
    }
}
