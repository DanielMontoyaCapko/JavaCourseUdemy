import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int numberSum = 0;

        while (true) {
            System.out.println("Input numbers to sum and average and input anything else to stop loop");
            String num = scanner.nextLine();
            try {
                int numSum = Integer.parseInt(num);
                counter++;
                numberSum += numSum;
            } catch (NumberFormatException nfe) {
                break;
            }
        }
        System.out.println("SUM = " + numberSum + " AVG = " + Math.round((double) numberSum/ counter));
    }

    public static void inputThenPrintSumAndAverage2(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while(scanner.hasNextInt()){
            sum += scanner.nextInt();
            count++;
            // scanner.nextLine(); // not really needed because we don't need to print an alert for invalid number
            // however, inputting multiple numbers separated by space will add all numbers
        }
        System.out.println("SUM = " + sum + " AVG = " + Math.round((double) sum/count));
        scanner.close();
    }
}
