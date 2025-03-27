package Strings;

public class Program9 {
    public static void main(String[] args) {
        String original= "kishi#$%&12";

        String aplha = "";
        long aplhaCount = 0;
        String numberic = "";
        long numericCount = 0;
        String specialCharacter="";
        long specialCount = 0;

        for(int i=0; i<original.length(); i++){
            char ch =original.charAt(i);
            if((ch>='a' && ch<='z')|| (ch>='A' && ch<='Z') ){
                aplha = aplha+ch;
                aplhaCount = aplhaCount+ch;
            }else if(ch>='0' && ch<='9' ){
                numberic = numberic+ch;
            }else{
                specialCharacter = specialCharacter+ch;
                specialCount = specialCount + ch;
            };
        }
        for(int i=0; i<numberic.length(); i++){
            numericCount += (int)(numberic.indexOf(i));
        }

        System.out.println("aplha:"+aplha);
        System.out.println("aplhaCount:"+aplhaCount);
        System.out.println("-----------------------");
        System.out.println("numberic:"+numberic);
        System.out.println("numericCount:"+numericCount);
        System.out.println("-----------------------");
        System.out.println("specialCharacter"+specialCharacter);
        System.out.println("specialCount:"+specialCount);

    }
}
