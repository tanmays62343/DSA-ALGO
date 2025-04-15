package basics.math;

import utils.Timer;

import java.util.ArrayList;
import java.util.Arrays;

public class AllDivisors {

    public static void main(String[] args) {
        System.out.println(Timer.calTime(() -> allDivisors_brute(12)));
        System.out.println(Timer.calTime(() -> allDivisors_optimal(12)));
    }

    static String allDivisors_brute(int n){
        ArrayList<Integer> divisors = new ArrayList<>();

        for(int i=1; i <= n; i++){
            if( (n % i) == 0 ){
                divisors.add(i);
            }
        }
        return divisors.toString();
    }

    static String allDivisors_optimal(int n){
        ArrayList<Integer> divisors = new ArrayList<Integer>();

        int sqrtN = (int) Math.sqrt(n);

        for(int i = 1; i <= sqrtN; ++i){

            if(n % i == 0) {
                divisors.add(i);
                // ? if d is divisor of n then n/d is also a divisor of n
                if(i != n/i){
                    divisors.add(n/i);
                }
            }
        }
        return divisors.toString();
    }

}
