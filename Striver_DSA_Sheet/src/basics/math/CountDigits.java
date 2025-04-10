package basics.math;

import utils.Timer;

public class CountDigits {

    public static void main(String [] args){
        System.out.println(Timer.calTime(() -> (countDigits_brute(1211))));
        System.out.println(Timer.calTime(() -> (countDigits_optimal1(1211))));
        System.out.println(Timer.calTime(() -> (countDigits_optimal2(1211))));
    }

    public static int countDigits_brute(int n){
        int count = 0;
        while(n > 0){
            count++;
            n /= 10;
        }
        return count;
    }

    //log to base 10 + 1 gives the count of the digits in number
    public static int countDigits_optimal1(int n){
        return (int) (Math.log10(n)+1);
    }

    public static int countDigits_optimal2(int n){ return String.valueOf(n).length(); }

}
