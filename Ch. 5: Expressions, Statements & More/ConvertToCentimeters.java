public class ConvertToCentimeters {

    public static void main(String[] args) {

        System.out.println(convertToCentimeters(69));
        System.out.println(convertToCentimeters(5,9));

    }

    public static double convertToCentimeters (int allInches) {

        return (allInches*2.54);

    }

    public static double convertToCentimeters (int feet, int inches) {

        return convertToCentimeters((feet*12) + inches);

    }

}
