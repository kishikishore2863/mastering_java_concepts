package TCSNQTPrepSession;

public class pattern {
    public static void main(String[] args) {

        for (int i = 0; i < 4; i++) {
            for (char ch = 'D'; ch >= 'D' - i; ch--) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

}
