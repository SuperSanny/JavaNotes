public class CountDigit {
    public static void main(String[] args) {
        int num = 00000001;
        System.out.println(countDigit(num));
    }
    static int countDigit(int num){
        if (num < 0){
            num *= -1;
        }
        return num;
//        return (int) (Math.log10(num))+1;
    }
}
