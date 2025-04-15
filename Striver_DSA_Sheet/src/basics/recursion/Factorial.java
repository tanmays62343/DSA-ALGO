package basics.recursion;

public class Factorial {

    public static void main(String[] args) {
        factorial_parameterized(5,1);
        System.out.println(factorial_functional(5));
    }

    static void factorial_parameterized(int n, int fact){
        if(n<=1){
            System.out.println(fact);
            return;
        }
        factorial_parameterized(n-1,fact*n);
    }

    static int factorial_functional(int n){
        if(n == 0) return 1;
        return n * factorial_functional(n-1);
    }

}
