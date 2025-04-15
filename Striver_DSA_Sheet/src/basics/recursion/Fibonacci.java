package basics.recursion;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(fibonacci(4));
    }

    static int fibonacci(int n){
        if(n <= 1) return n;
        int last = fibonacci(n-1);
        int sLast = fibonacci(n-2);
        return last+sLast;
    }

}
