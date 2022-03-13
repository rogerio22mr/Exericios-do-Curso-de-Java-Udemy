public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {
        getDurationString(65, 45);
        getDurationString(3600);
    }

    public static void getDurationString(int minutes, int seconds) {
        if(minutes < 0 || (seconds < 0 || seconds > 59 )) {
            System.out.println("Invalid value");
            return;
        }

        if(minutes > 59) {
            int hour = minutes / 60;
            int minute = minutes % 60;
            System.out.println(hour + "h " + minute + "m " + seconds + "s");
            return;
        }

        System.out.println("0h " + minutes + "m " + seconds + "s");
    }

    public static void getDurationString(int seconds) {
        if (seconds < 0) {
            System.out.println("Invalid value");
            return;
        }

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        getDurationString(minutes, remainingSeconds);
    }

}
