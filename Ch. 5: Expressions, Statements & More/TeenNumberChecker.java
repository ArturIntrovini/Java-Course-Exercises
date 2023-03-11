public class TeenNumberChecker {

    public static void main(String[] args) {

        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23,15,42));
        System.out.println(hasTeen(22,23,34));

    }

    public static boolean hasTeen (int numOne, int numTwo, int numThree) {

        if ((numOne >= 13 && numOne <= 19) || (numTwo >= 13 && numTwo <= 19) || (numThree >= 13 && numThree <= 19)) {
            return true;
        } else return false;

    }

}
