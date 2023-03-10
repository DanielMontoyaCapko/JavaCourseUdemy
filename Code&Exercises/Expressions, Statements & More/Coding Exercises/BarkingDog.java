public class BarkingDog {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp (true, 1));
        System.out.println(shouldWakeUp (false, 2));
        System.out.println(shouldWakeUp (true, 8));
        System.out.println(shouldWakeUp (true, -1));

    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        // return barking && ((hourOfDay >= 0 && 8 > hourOfDay) || (hourOfDay >= 22 && 24 > hourOfDay));
        if (barking && ((hourOfDay >= 0 && 8 > hourOfDay) || (hourOfDay > 22 && 24 > hourOfDay))){
            return true;
        }
        return false;
    }
}
