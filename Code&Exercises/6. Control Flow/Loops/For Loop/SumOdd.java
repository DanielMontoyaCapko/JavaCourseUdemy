public class SumOdd {

    public static void main(String[] args) {
        System.out.println(sumOdd(1,100));
        System.out.println(sumOdd(-1,100));
        System.out.println(sumOdd(100,100));
        System.out.println(sumOdd(13,13));
        System.out.println(sumOdd(100,-100));
        System.out.println(sumOdd(100,1000));
    }

    public static boolean isOdd(int number) {
        return number >= 0 && number % 2 != 0;
    }

    public static int sumOdd(int start, int end) {

        int totalSum = 0;
        if (end >= start && start > 0){
            for (int number = start; end >= number; number++){
                if (isOdd(number)){
                    totalSum += number;
                }
            }
        } else {
            return -1;
        }
        return totalSum;
    }
}
