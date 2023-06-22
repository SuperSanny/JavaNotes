import java.util.*;
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.nextLine();
        int len1=0, len2=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='a'){
                len1++;
            } else if (str.charAt(i)=='b') {
                len2++;
            }
        }
        if(len1 <= len2)
            System.out.println("Team B won ->Winning Team");
        else
            System.out.println("Team A won ->Winning Team");
    }
}
