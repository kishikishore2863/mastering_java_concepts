package Strings;

//input :hi good morning
public class Program8 {
    public static void main(String[] args) {
        String str = "hi good morning ";
        str = str.trim();
        StringBuilder sb = new StringBuilder(str);
        int start =0;
        for(int i=0; i<=str.length(); i++){
            if(i==str.length() ||  str.charAt(i) == ' ' && str.charAt(i+1)!=' '){
                int end = i-1;
                while(start<end){
                    char temp = str.charAt(start);
                    sb.setCharAt(start, str.charAt(end));
                    sb.setCharAt(end, temp);
                    start++;
                    end--;
                }
                start=i+1;
            }

        }
        sb.toString();
        System.out.println(sb);
    }
}
