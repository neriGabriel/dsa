package main.org.datastructure.arrays.problems;

public class IsValidPalindrome {

    /**
     * Given an string, check whether or not it is a palindrome
     * 
     * @param word
     * @return boolean value representing if the string is a palindrome or not.
     * 
     * Asymptomatic analysis:
     * Time: O(N);
     * Space: O(1);
     */
    boolean IsValidPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;

        while(left <= right) {

            while(left < right && !Character.isLetterOrDigit(word.charAt(left))) {
                left++;
            }

            while(right > left && !Character.isLetterOrDigit(word.charAt(right))) {
                right--;
            }

            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
