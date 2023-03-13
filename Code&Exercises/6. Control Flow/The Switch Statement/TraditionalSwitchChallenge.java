public class TraditionalSwitchChallenge {
    public static void main(String[] args) {
        char NATO = 'D';
        switch (NATO){
            case 'A':
                System.out.println(NATO + " = Abel");
                break;
            case 'B':
                System.out.println(NATO + " = Baker");
                break;
            case 'C':
                System.out.println(NATO + " = Charlie");
                break;
            case 'D':
                System.out.println(NATO + " = Dog");
                break;
            case 'E':
                System.out.println(NATO + " = Easy");
                break;
            default:
                System.out.println(NATO + " Not found");
                break;
        }
    }
}
