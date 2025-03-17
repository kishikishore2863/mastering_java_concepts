package TCSNQTPrepSession;

public class Program4 {
    public static void main(String[] args) {
      boolean res =  palindrome("dad");
        System.out.println(res);
    }

    static boolean palindrome(String str){
        char[] ch = str.toCharArray();
        int start =0;
        int end = ch.length-1;
        while(start<end){
            if(ch[start]!=ch[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

}
