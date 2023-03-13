public class Main {
    public static void main(String[] args) {
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(65,45));
    }
    public static String getDurationString(int seconds) {
        int minutes = seconds / 60;
        int hours = minutes / 60;
        return hours + "h " + minutes % 60 + "m " + seconds % 60 + "s.";
//        if(seconds >= 0){
//            time = seconds/60 + "m" + (seconds % 60) + "s";
//        } else {
//            time = "Time cannot be negative";
//        }
//        return time;
    }
    public static String getDurationString(int minutes, int seconds) {
        int totalSeconds = minutes * 60 + seconds;
        return getDurationString(totalSeconds);
//        String time;
//        int hours = minutes / 60;
//        minutes = seconds / 60;
//        if (seconds >= 0 && (minutes >= 0 && minutes <= 59)){
//            time = hours + "h " + minutes + "m" + seconds + "s";
//        } else {
//            time = "Wrong input.";
//        }
//        return time;
    }
}
