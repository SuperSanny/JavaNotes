class Raugh{
    public static void main(String[] args) {
        int n = 6, sum = 0, len =0;
        for(int i = 1; i<n; i++){
            sum += i;
            len++;
            if(sum==n){
                System.out.print(len);
            }
        }
    }
}