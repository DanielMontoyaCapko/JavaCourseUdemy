public class SpeedConverter {
    public static void main(String[] args) {
        toMilesPerHour(1.5);
        toMilesPerHour(10.25);
        toMilesPerHour(-5.6);
        toMilesPerHour(25.42);
        toMilesPerHour(75.114);

        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
    }

    public static long toMilesPerHour(double kilometerPerHour) {
        return kilometerPerHour < 0 ? -1 : Math.round(kilometerPerHour / 1.609);

//        long milesPerHour;
//        if (kilometerPerHour < 0) {
//            milesPerHour = -1;
//        } else {
//            milesPerHour = Math.round(kilometerPerHour / 1.609);
//        }
//        return milesPerHour;
    }

    public static void printConversion(double kilometersPerHour) {
        System.out.println(kilometersPerHour < 0 ? "Invalid Value" : kilometersPerHour + "km/h = " + toMilesPerHour(kilometersPerHour) + "mi/h");
    }
}
