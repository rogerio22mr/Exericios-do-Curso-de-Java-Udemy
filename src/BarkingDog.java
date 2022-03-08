public class BarkingDog {
    public static void main(String[] args) {
        boolean wakeUp = shouldWakeUp(true, 1);
        System.out.println(wakeUp);
        wakeUp = shouldWakeUp(false, 2);
        System.out.println(wakeUp);
        wakeUp = shouldWakeUp(true, 8);
        System.out.println(wakeUp);
        wakeUp = shouldWakeUp(true, -1);
        System.out.println(wakeUp);
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDays) {
        if (hourOfDays < 0 || hourOfDays > 23) {
            return false;
        } else if (barking && (hourOfDays < 8 || hourOfDays > 22)) {
            return true;
        } else {
            return false;
        }
    }
}
