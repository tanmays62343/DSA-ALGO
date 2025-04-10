package basics.math;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(12));
        System.out.println(isPalindrome(121));
    }

    static boolean isPalindrome(int n){
        int userInput = n;
        int reverse = 0;
        while(n > 0){
            int ld = n % 10;
            reverse = (reverse*10)+ld;
            n/=10;
        }
        return reverse == userInput;
    }

}
