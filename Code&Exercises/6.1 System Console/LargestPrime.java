public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(2));
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(31));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
    }

    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }
        for (int i = 2; i < number; i++) {
            if ((number % i) == 0) {
                number /= i;
                i--;
            }
        }
        return number;
    }

    public static int getLargePrime2(int number) {
        if(number < 2) return -1;

        int largestPrime = 0;
        for(int primeCheck = number; primeCheck > 2;primeCheck--){
            if (primeCheck % 2 != 0 && primeCheck % 3 !=0){
                if (number % primeCheck == 0){
                    largestPrime = primeCheck;
                }
            }
        }
        return largestPrime;
    }
}
