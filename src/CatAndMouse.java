//https://www.hackerrank.com/contests/mountblue-technologies/challenges/cats-and-a-mouse
import java.util.*;
public class CatAndMouse {
    static String catAndMouse(int x, int y, int z) {
        String res = "";
//        if((x<z && z>y)||(x>z && y<)){
//            res = "Cat A";
//        } else if (x<y && y>z) {
//            res = "Cat B";
//        }
//        else{
//            res = "Mouse C";
//        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        for (int i=0; i<q;i++){
            String[] xyz = sc.nextLine().split(" ");
            int x = Integer.parseInt(xyz[0]);
            int y = Integer.parseInt(xyz[1]);
            int z = Integer.parseInt(xyz[2]);
            String result = catAndMouse(x,y,z);
            System.out.println(result);
        }
    }
}
