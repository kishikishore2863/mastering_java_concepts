package TCSNQTPrepSession;

public class Program8 {
    public static void main(String[] args) {
        String enterd = "kishi the gamer";
        String str = enterd.toLowerCase();
        String temp = "";
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)>=97 && str.charAt(i)<=122) {
                if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                    temp = temp + '$';
                } else {
                    temp = temp + '&';
                }
            }else {
                temp= temp+str.charAt(i);
            }
        }
        System.out.println("replaced : "+temp);
    }
}
