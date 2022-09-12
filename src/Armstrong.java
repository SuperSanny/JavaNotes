//Check Number is Armstrong or Not.

import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();
        int sum = 0,r=0,r1=1,count = 0,num1 = num;
        while(num>0){
            r = num % 10;
            num /= 10;
            count++;
        }
        while(num1 > 0){
            r = num1 %10;
            for(int i=0;i<count;i++){
                r1 *=r;
            }
            sum +=r1;
            num1 /=10;
        }
        System.out.print(sum);
    }
}
