public class Main {
    public static void main(String[] args) {

        int value = 1;
        if(value == 1){
            System.out.println("Value was 1");
        } else if (value ==2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Value was not 1 or 2");
        }

        int newValue = 3;
        switch (newValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Was a 3, a 4, ora a 5");
                System.out.println("Actually it was a " + newValue);
            default:
                System.out.println("Value was not 1, 2, 3, 4 or 5");
                break;
        }
    }
}
