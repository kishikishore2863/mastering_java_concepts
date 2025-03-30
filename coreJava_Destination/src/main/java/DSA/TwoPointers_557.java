package DSA;

public class TwoPointers_557 {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest ";
        StringBuilder sb = new StringBuilder(s);
        int left =0;
        sb.append(" ");
        for(int right=0; right<s.length(); right++){
            int end = right-1;
            int start =left;
            if(s.charAt(right)==' ') {
                while (start < end) {
                    char temp = sb.charAt(start);
                    sb.setCharAt(start, sb.charAt(end));
                    sb.setCharAt(end, temp);
                    start++;
                    end--;
                }
                left = right+1;
            }

        }
        System.out.println(sb);

    }
}
