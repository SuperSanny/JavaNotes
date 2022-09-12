//https://leetcode.com/problems/reverse-string/
public class ReverseString {
    public static void main(String[] args) {
        char[] ch = {'h','e','l','l','o'};
        reverseString(ch);
    }
    static void reverseString(char[] s){
        recursion(s, 0, s.length-1);
        System.out.print("[");
        for (char c : s) {
            System.out.print("\""+c+"\",");
        }
        System.out.print("\b]");
    }
    static char[] recursion(char[] s, int start, int end){
        if(start>=end){
            return s;
        }
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;
        return recursion(s, start+1, end-1);
    }
}
