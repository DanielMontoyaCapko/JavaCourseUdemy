public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        int divisor = 0;
        if (first < 10 || second < 10){
            return -1;
        }
        for (int counter = 1; counter <= Math.min(first,second); counter++){
            if(first % counter == 0 && second % counter == 0){
                divisor = counter;
            }
        }
        return divisor;
    }
}

//    Udemy Solution
//    public static int getGreatestCommonDivisor(int first, int second) {
//
//        if (first < 10 || second < 10) {
//            return -1;
//        }
//        while (first != second) {
//            if (first > second)
//                first = first - second;
//            else {
//                second = second - first;
//            }
//        }
//        return second;
//    }
