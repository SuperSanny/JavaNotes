public class TransposeOfMatrix {
    public static void main(String[] args) {
        int[][] array = {
                {1, 1, 1, 1},
                {2, 2, 2, 2},
                {3, 3, 3, 3},
                {4, 4, 4, 4}
        };
        transpose(array, array.length);

    }
    static void transpose(int[][] arrray, int n){
        for (int i = 0; i < arrray.length; i++)
            for (int j = 0; j < arrray[i].length; j++) System.out.print(arrray[j][i] + " ");
    }
}
