//https://www.hackerrank.com/contests/mountblue-technologies/challenges/marcs-cakewalk
import java.io.*;
import java.util.*;

class Result {

    public static long marcsCakewalk(List<Integer> calorie) {
        // Write your code here
        long sum = 0;
        int p = 0;
        // Collections.sort(calorie, Collections.reverseOrder());
        Collections.sort(calorie);
        int len = calorie.size();
        // System.out.println(calorie.get(0));
        while(len-->0){
            sum+=calorie.get(len) * Math.pow((double)2, (double) p);
            p++;
            // len--;
        }

        return sum;
    }

}
public class MarcsCakewalk {
    public static void main(String[] args) throws IOException {

        List<Integer> calorie = new ArrayList<>(Arrays.asList(7,4,9,6));

        long result = Result.marcsCakewalk(calorie);
        System.out.println(result);
    }
}
