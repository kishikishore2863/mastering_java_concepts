package DSA;

import java.util.HashMap;
import java.util.Map;

public class Maximum_Number_of_Balloons_1189 {
    public static void main(String[] args) {
       int res =  maxNumberOfBalloons("nlaebolko");
        System.out.println(res);
    }

    public static int maxNumberOfBalloons(String text) {
        int res =0;
        Map<Character,Integer> balloon = new HashMap<>(){{
            put('b',0);
            put('a',0);
            put('l',1);
            put('o',1);
            put('n',0);
        }};
        System.out.println(balloon);

        for(int i=0; i<text.length(); i++){
            if(balloon.containsKey(text.charAt(i))){
                balloon.put(text.charAt(i),balloon.getOrDefault(text.charAt(i),0)+1);
            }
        }
        System.out.println(balloon);

        return res;
    }
}
