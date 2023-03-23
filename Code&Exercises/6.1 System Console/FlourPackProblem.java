public class FlourPackProblem {
    public static void main(String[] args) {
        System.out.println(canPack(2,1,5));
        System.out.println(canPack(1,0,4));
        System.out.println(canPack(1,0,5));
        System.out.println(canPack(0,5,4));
        System.out.println(canPack(2,2,11));
        System.out.println(canPack(-3,2,12));
        System.out.println(canPack(5,3,24));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(bigCount < 0 || smallCount < 0 || goal < 0) {  // #1 validation
            return false;
        }
        return ((bigCount * 5 + smallCount >= goal) && (goal % 5 <= smallCount)); // #2 and #3 test condition
    }
}
