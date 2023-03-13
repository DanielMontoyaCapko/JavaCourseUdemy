public class MinutesToYearsAndDaysCalculator {
    public static void main(String[] args) {    //not used for this exercise
        System.out.println(printYearsAndDays(525600));   
        System.out.println(printYearsAndDays(1051200));
        System.out.println(printYearsAndDays(561600));
    }

    public static void printYearsAndDays(long minutes) {
        long hours = minutes / 60;
        long days = hours / 24;
        long years = days / 365;
        System.out.println(minutes < 0 ? "Invalid Value" : minutes + " min = " + years + " y and " + days % 365 + " d");
    }
}
