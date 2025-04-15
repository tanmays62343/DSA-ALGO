package basics.recursion;

public class PrintNto1 {

    public static void main(String[] args) {
        //print(5);
        print_alternate(1,5);
    }

    static void print(int n){
        if(n < 1) return;
        System.out.println(n);
        print(n-1);
    }

    //? Backward recursion
    static void print_alternate(int i, int n){
        if(i > n) return;
        print_alternate(i+1,n);
        System.out.println(i);
    }

}
