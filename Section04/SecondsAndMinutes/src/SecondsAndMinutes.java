public class SecondsAndMinutes {
    private static final String INVALID_MESSAGE = "Invalid Values";
    public static void main(String[] args) {
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(-41));
        System.out.println(getDurationString(-1, 45));
        System.out.println(getDurationString(10, 60));
        System.out.println(getDurationString(61, 1));
    }

    private static String getDurationString(long minutes, long seconds) {
        if(minutes >= 0 && (seconds >= 0 && seconds <= 59)) {
            long hours = minutes / 60;
            long remainingMinutes = minutes % 60;

            String hoursString = hours + "h";
            if (hours < 10) {
                hoursString = "0" + hoursString;
            }
            String minutesString = remainingMinutes + "m";
            if (remainingMinutes < 10) {
                minutesString = "0" + minutesString;
            }
            String secondsString = seconds + "s";
            if (seconds < 10) {
                secondsString = "0" + secondsString;
            }
            return hoursString + " " + minutesString + " " + secondsString;
        }
        else {
            return INVALID_MESSAGE;
        }
    }

    private static String getDurationString(long seconds) {
        if(seconds >= 0) {
            long minutes = seconds / 60;
            long remaindingSeconds = seconds % 60;
            return (getDurationString(minutes, remaindingSeconds));
        }
        else {
            return INVALID_MESSAGE;
        }
    }
}
