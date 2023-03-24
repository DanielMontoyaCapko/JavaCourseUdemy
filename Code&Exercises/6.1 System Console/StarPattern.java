public class StarPattern {
    public static void main(String[] args) {
        Square(5);
        increasingTriangle(5);
        decreasingTriangle(5);
        rightSidedTriangle(8);
        rightSidedDecreasingTriangle(6);
        hill(9);
        reverseHill(5);
        diamond(5);
    }

    public static void Square(int number) {
        for (int count1 = 1; count1 <= number; count1++){
            for(int count2 = 1; count2 <= number; count2++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void increasingTriangle(int number) {
        for (int count1 = 1; count1 <= number; count1++){
            for(int count2 = 1; count2 <= count1; count2++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void decreasingTriangle(int number) {
        for (int count1 = 1; count1 <= number; count1++){
            for(int count2 = number; count2 >= count1; count2--){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void rightSidedTriangle(int number) {
        for (int count1 = 1; count1 <= number; count1++){
            for (int count2 = number; count2 >= count1; count2--){
                System.out.print(" ");
            }

            for (int count2 = 1; count2 <= count1; count2++)
                System.out.print("*");
            System.out.println();
        }
    }

    public static void rightSidedDecreasingTriangle(int number) {
        for (int count1 = 1; count1 <= number; count1++){
            for (int count2 = 1; count2 <= count1; count2++){
                System.out.print(" ");
            }

            for (int count2 = number; count2 >= count1; count2--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hill(int number) {
        for (int count1 = 1; count1 <= number; count1++){
            for (int count2 = number; count2 >= count1; count2--){
                System.out.print(" ");
            }
            for (int count2 = 1; count2 <= count1; count2++){
                System.out.print("*");
            }

            for (int count2 = 1; count2 <= count1 - 1; count2++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void reverseHill(int number) {
        for(int count1 = 1; count1 <= number; count1++){
            for(int count2 = 1; count2 <= count1; count2++){
                System.out.print(" ");
            }

            for (int count2 = number; count2 > count1; count2--){
                System.out.print("*");
            }

            for (int count2 = number; count2 >= count1; count2--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void diamond(int number) {
        for(int counter1 = 1; counter1 <= number -1; counter1++){
            for(int counter2 = number; counter2 >= counter1; counter2--){
                System.out.print(" ");
            }

            for (int counter2 = 1; counter2 < counter1; counter2++){
                System.out.print("*");
            }

            for (int counter2 = 1; counter2 <= counter1; counter2++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int counter1 = 1; counter1 <= number; counter1++){
            for (int counter2 = 1; counter2 <= counter1; counter2++){
                System.out.print(" ");
            }
            for (int counter2 = number; counter2 > counter1; counter2--){
                System.out.print("*");
            }
            for (int counter2 = number; counter2 >= counter1; counter2--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
