package basics.recursion;

public class Print1toN {

    public static void main(String[] args) {
        //print(5,1);
        print_alternate(5);
    }

    //? Forward Recursion
    static void print(int n, int i){
        if(n==0) return;
        System.out.println(i++);
        n--;
        print(n,i);
    }

    // ? Backward Recursion (Back Tracking)
    static void print_alternate(int i){
        if(i<1) return;
        print_alternate(i-1);
        System.out.println(i);
    }

}
