import java.util.*;

public class MinimumDistances {
    public static int minimumDistances(List<Integer> a) {
        // Write your code here
        List<Integer> list = new ArrayList<>();
        int diff = 0;
        int non  = 0;
        for (int i = 1; i < a.size(); i++) {
            for (int j = i+1; j < a.size(); j++) {
                if(a.get(i)==a.get(j)){
                    diff = Math.abs(j-i);
                    list.add(diff);
                }
                if(a.get(i)==a.get(j)){
                    non++;
                }
            }
        }
        if(non==0)
            return -1;
        else
            return Collections.min(list);
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,10));
        System.out.println(minimumDistances(list));

    }
}
