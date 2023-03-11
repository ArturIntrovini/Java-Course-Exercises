public class SecondClass {

    public static void main(String[] args) {
        double firstNumber = 20.00;
        double secondNumber = 80.00;

        double sumNumbers = (firstNumber + secondNumber) * 100.00;

        double remainder = sumNumbers % 40.00;

        boolean isZero = remainder == 0 ? true : false;

        System.out.println(isZero);

        if (isZero == false) {
            System.out.println("Got some Remainder");
        }


    }
}
