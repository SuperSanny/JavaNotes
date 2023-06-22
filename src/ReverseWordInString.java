//https://leetcode.com/problems/reverse-words-in-a-string-iii/?envType=study-plan&id=algorithm-i
public class ReverseWordInString {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.print(reverseWords(s));
    }
    static String reverseWords(String s) {
        String str = "";
        String str1 = "";
        String[] s1 = s.split(" ");
        for (int i = 0; i < s1.length; i++) {
            str += reverse(s1[i]);
        }
        for (int i = 1; i < str.length(); i++) {
            str1 += str.charAt(i);
        }
        return str1;
    }
    static String reverse(String s){
        String str = " ";
        for (int i = s.length()-1; i >= 0; i--) {
            str+=s.charAt(i);
        }
        return str;
    }
}
