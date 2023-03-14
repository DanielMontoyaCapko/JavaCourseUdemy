public class Main {
    public static void main(String[] args) {
//        for(int number = 1; number <= 5; number++){
//            System.out.println(number);
//        }
//
//        int secNum = 1;
//        boolean isReady = false;
//
//        do {
//            if(secNum>5){
//                break;
//            }
//            System.out.println(secNum);
//            secNum++;
//            isReady = (secNum > 0);
//        } while (isReady);

        int num = 0;
        while (num < 50){
            num += 5;
            if(num % 25 == 0){
                continue;
            }
            System.out.println(num + "_");
        }
    }
}
