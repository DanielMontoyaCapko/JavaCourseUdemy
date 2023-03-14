public class PrimeNumberChallenge {
    public static void main(String[] args) {
        int counter = 0;
        for (int numList = 1; numList <= 1000; numList++){             // can add ( counter < 3 && numList <= 1000) instead as well
            if (isPrime(numList)){
                System.out.println(numList + " is a prime number");
                counter++;
                if (counter == 3){
                    break;
                }
            }
        }
    }
    public static boolean isPrime(int number){
        if(number <= 2){
            return (number == 2);
        }

        for (int divisor = 2; divisor < number; divisor++){
            if (number % divisor == 0){
                return false;
            }
        }
        return true;
    }
}
