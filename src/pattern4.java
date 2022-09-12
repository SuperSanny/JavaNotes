public class pattern4 {
    public static void main(String[] args) {
        for(int i=1;i<=3;i++){
            for (int k = 4; k >=i ; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i*3; j=j+2) {
                System.out.print(i+" ");
            }

            System.out.print("\n");
        }
        for(int i=1;i<=7;i++){
            System.out.print("4 ");
        }
        System.out.print("\n");
        for(int i=3;i>=1;i--){
            for (int k = i; k <=4 ; k++) {
                System.out.print(" ");
            }
            for (int j = i*3; j >= 1; j=j-2) {
                System.out.print(i+" ");
            }
            System.out.print("\n");
        }
    }
}
