package basics.math;

public class ArmstrongNumber {

    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
    }

    //? Armstrong ex : 153 => 1^3 + 5^3 + 3^3 = 153
    static boolean isArmstrong(int n){
        int totalDigits = String.valueOf(n).length();
        int sum = 0;
        int num = n;
        while(num > 0){
            int ld = num % 10;
            sum += Math.pow(ld,totalDigits);
            num /= 10;
        }
        return sum == n;
    }

}
