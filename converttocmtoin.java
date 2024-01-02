public class Challenge {
    public static void main(String[] args) {
        System.out.println(convertToCentimeters(5,8));
        System.out.println(convertToCentimeters(68));

    }
    public static double convertToCentimeters(int heightInInches){
        double centimetes;
        centimetes=heightInInches*2.54;
        return centimetes;
    }
    public static double convertToCentimeters(int heightInFeet,int heightInInches){
        int inches;
        inches=heightInFeet*12+heightInInches;
        return convertToCentimeters(inches);
    }
}
