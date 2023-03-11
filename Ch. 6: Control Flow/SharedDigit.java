public class SharedDigit {

    public static void main(String[] args) {

        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));

    }

    public static boolean hasSharedDigit (int numOne, int numTwo) {

        if (numOne <10 || numOne >99 || numTwo <10 || numTwo >99) {
            return false;
        }

        int digitOneOne = numOne/10;
        int digitOneTwo = numOne%10;
        int digitTwoOne = numTwo/10;
        int digitTwoTwo = numTwo%10;

        if ((digitOneOne == digitTwoOne || digitOneOne == digitTwoTwo) || (digitOneTwo == digitTwoOne || digitOneTwo == digitTwoTwo)) {
            return true;
        } return false;
    }

}
