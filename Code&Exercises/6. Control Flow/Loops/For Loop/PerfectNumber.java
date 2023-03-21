public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(1));
        System.out.println(isPerfectNumber(33550336));
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) return false;

        int perfectNum = 0;
        for (int counter = 1; counter < number; counter++){
            if (number % counter == 0){
                perfectNum += counter;
            }
        }
        return perfectNum == number;
    }

  //Udemy result
    public static boolean isPerfectNumber2(int number) {

        int sumOfProperDivisors = 0;

        for (int i = 1;i < number;i++)
            if (number % i == 0)
                sumOfProperDivisors += i;

        return sumOfProperDivisors == number && number > 1;
    }
}
