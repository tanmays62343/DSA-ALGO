package basics.recursion;

public class PrintNTimes {

    public static void main(String[] args) {
        print(5);
    }

    static void print(int n){
        if(n == 0) return;
        System.out.println("Hello");
        print(n-1);
    }

}
