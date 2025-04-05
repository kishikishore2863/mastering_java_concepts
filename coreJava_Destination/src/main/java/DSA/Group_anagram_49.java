package DSA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Group_anagram_49 {
    public static void main(String[] args) {
        String [] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>>  res =   groupAnagrams(strs);
        System.out.println(res);
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hash  = new HashMap<>();
        for(String s:strs){
            String key =sort(s) ;
            if(!hash.containsKey(key)){
                hash.put(key,new ArrayList<String>());
            }
            hash.get(key).add(s);
        }
        for(List<String> s : hash.values() ){
            System.out.println(s);
        }

        return new ArrayList(hash.values());
    }

    public static String sort(String s){
        StringBuilder sb = new StringBuilder(s);
        for(int i=0; i<sb.length()-1; i++){
            for (int j=i+1;j<sb.length(); j++){
                if(sb.charAt(i)>sb.charAt(j)){
                    char temp = sb.charAt(i);
                    sb.setCharAt(i, sb.charAt(j));
                    sb.setCharAt(j, temp);
                }
            }
        }
        return sb.toString();
    }
}
