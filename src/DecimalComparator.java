public class DecimalComparator {
    public static void main(String[] args) {
        boolean equal = areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        System.out.println(equal);
        equal = areEqualByThreeDecimalPlaces(3.175, 3.176);
        System.out.println(equal);
        equal = areEqualByThreeDecimalPlaces(3.0, 3.0);
        System.out.println(equal);
        equal = areEqualByThreeDecimalPlaces(-3.123, 3.123);
        System.out.println(equal);
    }

    public static boolean areEqualByThreeDecimalPlaces(double d1, double d2) {
        int myFirstCheck = (int)(d1 * 1000);
        int mySecondCheck = (int)(d2 * 1000);
        if(myFirstCheck - mySecondCheck == 0){
            return true;
        } else {
            return false;
        }
    }
}
