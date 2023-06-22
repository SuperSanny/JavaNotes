//https://practice.geeksforgeeks.org/problems/ncr1019/1
public class NcR {
    static int nCr(int n, int r)
    {
        if(r>n)
            return 0;

        long res = fact(n)/(fact(r) *fact(n-r));
        return (int)res;
    }
    static long fact(int n){
        if(n==1 || n==0)
            return 1;

        long res = ((n)* fact(n-1));
        return res;
    }
    public static void main(String[] args) {
        System.out.println(fact(116));
        System.out.println(nCr(15, 3));
    }
}
