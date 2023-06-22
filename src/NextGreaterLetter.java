//https://leetcode.com/problems/find-smallest-letter-greater-than-target/
import  java.util.*;
public class NextGreaterLetter {

//    static char NextGreaterLetter(char[] letters, char target){
//        int start = 0;
//        int end = letters.length-1;
//        if(target >= letters[end])
//            return letters[start];
//
//        while (start <= end){
//            int mid = start + (end-start)/2;
//            if(target > letters[mid]){
//                start = start+1;
//            } else if (target < letters[mid]) {
//                end = end-1;
//            }
//            else{
//                if(target == letters[mid+1])
//                    start = mid+1;
//                else
//                    return letters[mid+1];
//            }
//        }
//        return letters[start];
//    }
static char NextGreaterLetter(char[] letters, char target){
    int start = 0;
    int end = letters.length-1;
    while (start <= end){
        int mid = start + (end-start)/2;
        if (target < letters[mid]) {
            end = end-1;
        } else{
            start = mid+1;
        }
    }
    return letters[start % letters.length];
}
    public static void main(String[] args) {
        char[] str = {'e','e','e','e','e','e','n','n','n','n'};
        char target = 'e';
        System.out.println(NextGreaterLetter(str, target));
    }
}
