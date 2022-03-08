public class LeapYearCalculator {
    public static void main(String[] args) {
        boolean leapYear = isLeapYear(-1600);
        System.out.println(leapYear);
        leapYear = isLeapYear(1600);
        System.out.println(leapYear);
        leapYear = isLeapYear(2017);
        System.out.println(leapYear);
        leapYear = isLeapYear(2000);
        System.out.println(leapYear);
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    return true;
                }
            } else {
                return false;
            }
        }
    }
}
