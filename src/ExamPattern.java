import java.util.*;
public class ExamPattern {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int N = Sc.nextInt();
        if(N>=1 && N<=9){
            for(int i=0; i<N; i++){
                for(int j=0; j<i; j++)
                    System.out.print("  ");

                for(int j=N-i; j>=1; j--)
                    System.out.print((j)+" ");

                for(int j=1; j<N-i; j++)
                    System.out.print((j+1)+" ");

                System.out.println();
            }
        }
        else{
            System.out.println("Please enter number between 1 to 9.");
        }
    }
}
