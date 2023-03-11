public class NumberInWord {

    public static void main(String[] args) {

        printNumberWord(0);
        printNumberWord(1);
        printNumberWord(2);
        printNumberWord(3);
        printNumberWord(4);
        printNumberWord(5);
        printNumberWord(6);
        printNumberWord(7);
        printNumberWord(8);
        printNumberWord(9);
        printNumberWord(10);

    }

    public static void printNumberWord (int number){

        String dayOfWeek = switch (number) {
            case 0 -> "ZERO";
            case 1 -> "ONE";
            case 2 -> "TWO";
            case 3 -> "THREE";
            case 4 -> "FOUR";
            case 5 -> "FIVE";
            case 6 -> "SIX";
            case 7 -> "SEVEN";
            case 8 -> "EIGHT";
            case 9 -> "NINE";
            default -> "OTHER";
        };

        System.out.println(dayOfWeek);

    }

}