package basics.math;

import utils.Timer;

public class GCDorHCF {

    public static void main(String[] args) {
        System.out.println(Timer.calTime(() -> hcf_brute(20,40) ));
        System.out.println(Timer.calTime(() -> hcf_better(20,40) ));
        System.out.println(Timer.calTime(() -> hcf_optimal(20,40) ));
    }

    static int hcf_brute(int n1, int n2){
        int gcd = 1;

        for(int i=1; i<= Math.min(n1,n2); i++){
            if(n1%i == 0 && n2%i == 0){
                gcd = i;
            }
        }

        return gcd;
    }

    static int hcf_better(int n1, int n2){
        for(int i = Math.min(n1, n2); i > 0; i--){
            if(n1%i == 0 && n2%i == 0){
                return i;
            }
        }

        return 1;
    }

    //!Euclidean Algorithm
    //[gcd(a,b) = gcd(a-b,b) where a>b]
    /*Repeatedly subtract the smaller number from the larger number until one of them becomes 0,
    Once one of them becomes 0, the other number is the GCD of the original numbers.*/
    static int hcf_optimal(int n1, int n2){
        while(n1 > 0 && n2 > 0){
            if(n1 > n2){
                n1 = n1 % n2;
            } else {
                n2 = n2 % n1;
            }
        }
        if(n1 == 0){
            return n2;
        } else {
            return n1;
        }
    }

}
