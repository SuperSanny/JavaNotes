public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12, 452, 8, 3, 415465, 64849, 2536, 20};
        System.out.println("Total numbers of even digits : " + findNumbers(nums));
        System.out.println("How many digits in 458716 : " + digitsNumber(000000001));
        System.out.println("How many digits in 458716 : " + digits(1000000000));
    }
    static int findNumbers(int[] nums){
        int count = 0;
        for (int num : nums)
            if (even(num))
                count++;
        return count;
    }
//    check number is even or not
    static boolean even(int num) {
        return digitsNumber(num) % 2 == 0;
    }

//    Check how many number in digits
    static int digitsNumber(int num){
//        if number is negative then do positive
        if (num < 0)
            num *= -1;
//        if number is 0 then count 1
        if(num == 0)
            return 1;

        int count = 0;
        while(num>0){
            count ++;
            num/=10;
        }
        return count;
    }

    // Simplest trick to find the digits into numbers
    static int digits(int num){
        if(num < 0)
            num *= -1;
        return (int)(Math.log10(num)) + 1;
    }
}
