public class FlourPackProblem {

    public static void main(String[] args) {

        System.out.println(canPack(1,0,4));
        System.out.println(canPack(1,0,5));
        System.out.println(canPack(0,5,4));
        System.out.println(canPack(2,2,11));
        System.out.println(canPack(-3,2,12));

    }

    public static boolean canPack (int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0 || ((bigCount*5 + smallCount) < goal)) {
            return false;
        }

        if (bigCount == 0 && smallCount >= goal) {
            return true;
        }

        if (goal >= bigCount*5 && smallCount >= (bigCount*5-goal)) {
            return true;
        } else return false;

    }

}
