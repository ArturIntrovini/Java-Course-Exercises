public class PositiveNegativeZero {

    public static void main(String[] args) {

        checkNumber(10);
        checkNumber(-10);
        checkNumber(0);

    }
    public static void checkNumber (int number) {
        if (number < 0) {
            System.out.println("negative");
        } else if (number > 0) {
            System.out.println("positive");
        } else System.out.println("zero");
    }
}