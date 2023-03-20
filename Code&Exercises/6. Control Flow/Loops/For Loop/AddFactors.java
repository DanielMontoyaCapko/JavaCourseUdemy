public class AllFactors {

    public static void main(String[] args) {
        printFactors(34);
    }

    public static void printFactors(int number) {
        if (number < 1){
            System.out.println("Invalid Value");
        } else {
            for(int counter = 1; number >= counter;counter++){
                if (number % counter == 0) System.out.println(counter);
            }
        }
    }
}
