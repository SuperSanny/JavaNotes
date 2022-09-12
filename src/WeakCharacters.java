//https://leetcode.com/problems/the-number-of-weak-characters-in-the-game/
public class WeakCharacters {
    public static void main(String[] args) {
        int[][] arrs= {
            {5,5},
            {6,3},
            {3,6}
        };
        System.out.println(numberOfWeakCharacters(arrs));
    }
    static int numberOfWeakCharacters(int[][] properties){
        int count=0;
        for (int i = 0; i < properties.length; i++) {
            for (int j = 0; j < properties[i].length; j++) {
                if((properties[i][0] > properties[0][j]) && (properties[1][j] > properties[i][1]))
                    count++;
            }
        }
        return count;
    }
}
