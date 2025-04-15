package basics.math;

import utils.Timer;

public class PrimeNumber {

    public static void main(String[] args) {
        System.out.println(Timer.calTime(() -> isPrime_brute(8)));
        System.out.println(Timer.calTime(() -> isPrime_optimal(1)));
    }

    static boolean isPrime_brute(int n){
        int counter = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                counter++;
            }
        }
        return counter == 2;
    }

    static boolean isPrime_optimal(int n){
        int counter = 0;
        for(int i = 1; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                counter++;
                if(i != n/i){
                    counter++;
                }
            }
        }
        return counter == 2;
    }

}
