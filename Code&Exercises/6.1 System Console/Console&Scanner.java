import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int currentYear = 2022;

        try{
            System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException e){
            System.out.println(getInputFromScanner(currentYear));
        }
    }

    public static String getInputFromConsole(int currentYear) {

        String name = System.console().readLine("Hi, Whats your Name?");
        System.out.println("Hi " + name + ", Thanks for taking the course!");

        String dateOfBirth = System.console().readLine("What year where you born? ");
        int age = currentYear -Integer.parseInt(dateOfBirth);

        return "So you are " + age + " years old";
    }
    public static String getInputFromScanner(int currentYear) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi, Whats your name");
        String name = scanner.nextLine();
        System.out.println("Hi " + name + ", Thanks for taking the course!");

        System.out.println("What year where you born? ");
        int dateOfBirth = scanner.nextInt();
        int age = currentYear - dateOfBirth;
        return "So you are " + age + " years old";
    }
}
