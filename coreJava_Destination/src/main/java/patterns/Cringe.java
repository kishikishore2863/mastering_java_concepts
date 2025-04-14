package patterns;

public class Cringe {
    public static void main(String[] args) {
        char d ='D';
        for(int i=0; i<5;i++){
            for(char ch='D'; ch>'D'-i;ch--){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
