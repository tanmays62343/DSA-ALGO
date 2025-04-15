package basics.recursion;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome_brute("ABC"));
        System.out.println(isPalindrome_optimal("ABA"));
        System.out.println(isPalindrome(1,"ABC"));
    }

    static boolean isPalindrome_brute(String s){
        String sTemp = "";
        for(int i =0; i<s.length(); i++){
            sTemp = s.charAt(i) + sTemp;
        }
        return s.equals(sTemp);
    }

    static boolean isPalindrome_optimal(String s){
        int left = 0;
        int right = s.length()-1;
        while (left<right){
            char l = s.charAt(left);
            char r = s.charAt(right);
            if(!Character.isLetterOrDigit(l)){
                left++;
            } else if (!Character.isLetterOrDigit(r)) {
                right--;
            } else if(Character.toLowerCase(l) != Character.toLowerCase(r)){
                return false;
            } else{
                left++;
                right--;
            }
        }
        return true;
    }

    static boolean isPalindrome(int i, String s){
        if(i >= s.length()/2) return true;
        if(s.charAt(i) != s.charAt(s.length()-i-1)) return false;
        return isPalindrome(i+1,s);
    }

}
