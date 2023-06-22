import java.util.Scanner;
public class Pattern5
{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int N = Sc.nextInt();
        int k=1;
        for (int i = 1; i <= 2*N-1; i++) {
            for (int j = 1; j <= 2*N-1; j++) {
                if(i==j || i+j==2*N){
                    System.out.print(k+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            if(i<N){
                k++;
            }
            else {
                k--;
            }
            System.out.println();
        }

    }
}