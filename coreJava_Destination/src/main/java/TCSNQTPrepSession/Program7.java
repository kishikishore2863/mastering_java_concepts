package TCSNQTPrepSession;
//WAP to c
public class Program7 {
    public static void main(String[] args) {
        int vowel_count =0;
        int consounet_count =0;
        String strEntered = "kishi the gamer";
        String str = strEntered.toLowerCase();
        for(int i=0; i<str.length(); i++){
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                vowel_count++;
            }else {
                consounet_count++;
            }
        }
        System.out.println("Length of the string is ="+str.length());
        System.out.println("Total number of vowels ="+vowel_count);
        System.out.println("Total number of cansonants ="+consounet_count);
    }
}
