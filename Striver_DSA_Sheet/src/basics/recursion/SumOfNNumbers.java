package basics.recursion;

public class SumOfNNumbers {

    public static void main(String[] args) {
        sumOfN(5,0);
        System.out.println(sumOfN_alternate(5));
    }

    static void sumOfN(int n, int sum){
        if(n < 1){
            System.out.println(sum);
            return;
        }
        sumOfN(n-1,sum+n);
    }

    static int sumOfN_alternate(int n){
        if(n == 0 ) return 0;
        return n + sumOfN_alternate(n-1);
    }

}
