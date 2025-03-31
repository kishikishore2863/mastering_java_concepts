package DSA;

public class Maximum_Numbers_in_vowel_1456 {
    public static void main(String[] args) {
//        int s = maxVowels("leetcode",3);
//        int s = maxVowels("aeiou",2);
        int s = maxVowels("abciiidef",3);
        System.out.println(s);
    }


    public static int maxVowels(String s, int k) {

        int count =0;


        for(int i=0; i<k; i++){
            if(s.charAt(i) == 'a' ||
                        s.charAt(i) == 'e' ||
                        s.charAt(i) == 'i' ||
                        s.charAt(i) == 'o' ||
                        s.charAt(i) == 'u'){
                    count++;
            }

        }
        int max = count;

        int leftBound = 0;
        for(int rightBound = k; rightBound<s.length(); rightBound++){
            if(s.charAt(rightBound) == 'a' ||
                    s.charAt(rightBound) == 'e' ||
                    s.charAt(rightBound) == 'i' ||
                    s.charAt(rightBound) == 'o' ||
                    s.charAt(rightBound) == 'u'){
                count++;
            }





            if(s.charAt(leftBound) == 'a' ||
                    s.charAt(leftBound) == 'e' ||
                    s.charAt(leftBound) == 'i' ||
                    s.charAt(leftBound) == 'o' ||
                    s.charAt(leftBound) == 'u'){
                count--;
            }
            leftBound++;
            max = Math.max(count,max);

        }
        return max;
    }
}
