package basics.math;

public class ReverseANumber {

    public static void main(String[] args) {
        System.out.println(reverseNumber(8211));
    }

    static int reverseNumber(int n){
        int reversedNumber = 0;
        while(n > 0){
            int ld = n % 10;
            reversedNumber = (reversedNumber * 10) + ld;
            n/=10;
        }
        return reversedNumber;
    }

}
