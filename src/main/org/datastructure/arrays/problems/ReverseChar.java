package main.org.datastructure.arrays.problems;

public class ReverseChar {
    public void reverseString(char[] s) {
        if(s == null || s.length <= 0) return;
        
        int left = 0;
        int right  = s.length - 1;
        
        while(left <= right) {
            char tempChar = s[left];
            s[left] = s[right];
            s[right] = tempChar; 
            left++;
            right--;
        }
    }
}
