public class Sum3And5Challenge {
    public static void main(String[] args) {

        int counter = 0;
        int sumNumbers = 0;

        for (int number = 1; counter < 5 && (number >= 1 && number <= 1000); number++){
            if(number % 3 == 0 && number % 5 == 0){
                System.out.println(number);
                sumNumbers += number;
                counter++;
            }
        }
        System.out.println("The sum of the 5 numbers = " + sumNumbers);
    }
}
