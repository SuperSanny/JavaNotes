import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("Please enter only odd number :");
            int size = sc.nextInt();
            if (size == 0) {
                break;
            }
            if(size%2==0) {
                System.out.print("Enter online Odd number.");
            }
            else{
                // using Ternary Operator  Methods
                for (int i = 0; i < size; i++) {
                    for (int j = 0; j < size; j++)
                        System.out.print((i == j || i+j == size-1) ? " X " : " 0 ");
                    System.out.print("\n");
                }
            }
        }
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                if(i == j || i+j == 2){
//                    System.out.print(" X ");
//                }else{
//                    System.out.print(" 0 ");
//                }
//            }
//            System.out.print("\n");
//        }
    }
}
