package DSA;

import java.util.HashMap;
import java.util.Map;

public class Longest_subString_3 {

    public static void main(String[] args) {
      int res =  lengthOfLongestSubstring("abcabcbb");
        System.out.println(res);
    }



    public static int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> hash = new HashMap<>();
        int left=0;
        int right=0;
        int res=0;
        while(right<s.length()){
            char c = s.charAt(right);
            hash.put(c,hash.getOrDefault(c,0)+1);

            while(hash.get(c)>1){
                char l = s.charAt(left);
                hash.put(l, hash.get(l) - 1);
                left++;
            }
            res = Math.max(res, right - left + 1);
            right++;
        }
        return res;
    }
}
