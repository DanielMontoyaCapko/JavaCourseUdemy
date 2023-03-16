public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }

    public static int getEvenDigitSum(int number) {
        if(number < 0) return -1;

        int sumEven = 0;
        while(number != 0){
            sumEven += (number % 2 == 0) ? (number % 10) : 0; //If even number, sum the reminder of the number % 10, if not, add 0.
            number /= 10;
        }
        return sumEven;
    }
}
