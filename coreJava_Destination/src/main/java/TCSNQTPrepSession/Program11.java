package TCSNQTPrepSession;

public class Program11 {
    public static void main(String[] args) {
        String str ="a";
        String temp = "";
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='a'|| str.charAt(i)=='A'){
                temp=temp+'!';
            }else if(str.charAt(i)=='e'|| str.charAt(i)=='E'){
                temp=temp+'@';
            }else if(str.charAt(i)=='i'|| str.charAt(i)=='I'){
                temp=temp+'#';
            }else if(str.charAt(i)=='o'|| str.charAt(i)=='O'){
                temp=temp+'$';
            }else if(str.charAt(i)=='u'|| str.charAt(i)=='U'){
                temp=temp+'%';
            }else{
                temp=temp+str.charAt(i);
            }
        }
        System.out.println(temp);

    }
}
