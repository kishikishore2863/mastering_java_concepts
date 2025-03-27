package DSA;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println( isPalindrome(-121));
    }

    public static boolean isPalindrome(int x) {
        int rev =0;
        int clone = x;
        while(x > 0){
            int lastDigit = x%10;
//            if (rev > Integer.MAX_VALUE / 10) return false;
            rev = rev*10+lastDigit;
            x=x/10;
        }
        System.out.println(rev);
        return clone == rev;
    }
}
