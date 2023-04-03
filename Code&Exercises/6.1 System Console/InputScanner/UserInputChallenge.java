import java.util.Scanner;

public class UserInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int counter = 1;

        while (counter <= 5){
            System.out.println("Enter number #" + counter);
            String nextNumber = scanner.nextLine();
            try{
                double number = Double.parseDouble(nextNumber);   // int number = Integer.parseInt(nextNumber);
                counter++;
                sum += number;
            } catch (NumberFormatException nfe){
                System.out.println("Invalid Number");
            }
        }
        System.out.println(sum);
    }
}

//        for(int counter = 1; counter <= 5; counter++){
//            System.out.println("Enter number #" + counter);
//            int number = scanner.nextInt();
//            try {
//                sum += number;
//            } catch (NumberFormatException nfe){
//                System.out.println("Invalid Number");
//            }
//        }
//        System.out.println(sum);
