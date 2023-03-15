public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println(sumDigits(4294));
    }
// n % 10        n = n /10
    public static int sumDigits(int number) {
        int sumResult = 0;
        if (number >= 0 && number < 10){
            return number;
        } else if (number >= 0){
            while (number > 0){
                sumResult += number % 10;
                number = number / 10;
            }
            return sumResult;
        } else {
            return -1;
        }
    }
}
