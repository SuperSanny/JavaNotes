public class Pattern1 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if (i==3)
                    System.out.print(j+ " ");
                else if (j==3)
                    System.out.print(i+ " ");
                else
                    System.out.print("  ");
            }
            System.out.print(" \n");
        }
    }
}
