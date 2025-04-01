package DSA;

import java.util.HashMap;
import java.util.Map;

public class Check_if_All_Characters_1941 {
    public static void main(String[] args) {
      boolean ans  =  areOccurrencesEqual("wzkpzzwzpzkwkpkppzkppkpkwwkzzzwwpwwk");
        System.out.println(ans);
    }

    public static boolean areOccurrencesEqual(String s) {
        Map<Character,Integer> count = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            count.put(s.charAt(i),count.getOrDefault(s.charAt(i),0)+1);
        }
        System.out.println(count);
        for(char key:count.keySet()){
            System.out.println(key);
            int ch = count.get(key);
            if(ch%2!=0){
                return false;
            }

        }
        return false;
    }
}

