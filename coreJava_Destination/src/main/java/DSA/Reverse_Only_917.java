package DSA;

public class Reverse_Only_917 {
    public static void main(String[] args) {
//        String s = "a-bC-dEf-ghIj";
        String s = "Test1ng-Leet=code-Q!";
//        String s = "ab-cd";
        reverseOnlyLetters(s);
    }

    public static void reverseOnlyLetters(String s) {
        StringBuilder sb = new StringBuilder(s);
        int start=0;
        int end =sb.length()-1;
        while(start<end){
            if((sb.charAt(start)>='a'&& sb.charAt(start)<='z') || (sb.charAt(start)>='A'&& sb.charAt(start)<='Z')){
                if((sb.charAt(end)>='a'&&sb.charAt(end)<='z') || (sb.charAt(end)>='A'&& sb.charAt(end)<='Z')){
                    char temp = sb.charAt(start);
                    sb.setCharAt(start,sb.charAt(end));
                    sb.setCharAt(end,temp);
                    start++;
                    end--;
                }else{
                    end--;
                }

            }else{
                start++;
            }
        }
        System.out.println(sb);
    }
}
