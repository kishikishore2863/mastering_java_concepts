package patterns;

public class Pattern20 {
    public static void main(String[] args) {
        int n =11;
        for(int i=0; i<=n-1; i++){
            for(int j=0; j<=n-1; j++){
                if(i==0 || j==(n-1) || i==n-1 || j==0 || j==n-1 || i==j || i+j==n-1 || i+j  == (n/2) || j-i== (n/2) || i-j == (n/2) || i+j ==(n-1)+n/2){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
