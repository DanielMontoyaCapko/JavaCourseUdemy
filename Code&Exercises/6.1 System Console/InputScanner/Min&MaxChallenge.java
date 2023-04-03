import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double max = 0;
        double min = 0;
        int loopCount = 0;

        while (true) {
            System.out.println("Enter a number, or any character to exit:");
            String nextEntry = scanner.nextLine();
            try {
                double validNum = Double.parseDouble(nextEntry);
                if (loopCount == 0 || validNum < min) {
                    min = validNum;
                }
                if (loopCount == 0 || validNum > max) {
                    max = validNum;
                }
                loopCount++;
            } catch (NumberFormatException nfe) {
                break;
            }
        }

        if (loopCount > 0) {
            System.out.println("min = " + min + ", max = " + max);
        } else {
            System.out.println("No valid data entered");
        }
    }
    
    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean valid = true;
        double min = 0;
        double max = 0;
        int counter = 0;

        do{
            System.out.println("Please enter a number: " + "\n" + "Enter any other character to quit the loop.");
            String nextNumber = scanner.nextLine();

            try{
                double number = Double.parseDouble(nextNumber);
                if(counter == 1 || number > max){
                    max = number;
                    counter += 1;
                }
                if (counter == 1 || number < min) {
                    min = number;
                    counter += 1;
                }
            } catch (NumberFormatException nft){
                System.out.println("Exit the loop" + "\n" + " The min and max values are: " + min + " & " + max);
                valid = false;
            }
        } while (valid);
    }
    
}
