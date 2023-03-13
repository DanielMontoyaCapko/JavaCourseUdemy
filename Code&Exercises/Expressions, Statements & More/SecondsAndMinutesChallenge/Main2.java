public class Main {
    public static void main(String[] args) {
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(65,45));
    }
    public static String getDurationString(int seconds) {
        int minutes = seconds / 60;
        int hours = minutes / 60;
        if (!(seconds >= 0) || (minutes >= 0 && minutes <= 59)){
            return "Invalid";
        }
        return (hours + "h " + minutes % 60 + "m " + seconds % 60 + "s.");
    }

    public static String getDurationString(int minutes, int seconds) {
        int totalSeconds = minutes * 60 + seconds;
        return getDurationString(totalSeconds);
    }
}
