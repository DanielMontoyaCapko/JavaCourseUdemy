public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-12321));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
        System.out.println(isPalindrome(8));
    }
    public static boolean isPalindrome(int number){
        int reverse = 0;
        int origin = number;
        while(number != 0){
            int lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit; //Multiplication of number received first and sum of next one.
            number /= 10;
        }
        return origin == reverse;
    }
}
