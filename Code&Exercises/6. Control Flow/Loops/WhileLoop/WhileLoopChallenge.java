public class WhileLoopChallenge {
    public static void main(String[] args) {

        int number = 4;
        int counterEvenNum = 0;
        int counterOddNum = 0;
        while (number >= 4 && number <= 20){
            number += 1;
            if(isEvenNumber(number)){
                counterEvenNum += 1;
                System.out.println(number);
                if(counterEvenNum == 5){
                    break;
                }
            } else {
                counterOddNum += 1;
            }
        }
        System.out.println("Total even numbers found = " + counterEvenNum);
        System.out.println("Total odd numbers found = " + counterOddNum);
    }

    public static boolean isEvenNumber(int number) {
       return (number % 2 == 0);
    }

    
    
    
  
  
  
  
  
    //Udemy Solution
    public static void main2(String[] args) {

        int number = 4;
        int finishNumber = 20;
        int evenCount = 0;
        int oddCount = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber2(number)) {
                oddCount++;
                continue;
            }
            System.out.println("Even number " + number);
            evenCount++;
            if (evenCount >= 5) {
                break;
            }
        }

        System.out.println("Total odd numbers found = " + oddCount);
        System.out.println("Total even numbers found = " + evenCount);
    }

    public static boolean isEvenNumber2(int number) {

        if ((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }

}
