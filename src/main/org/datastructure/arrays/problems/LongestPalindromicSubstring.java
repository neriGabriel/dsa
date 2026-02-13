package main.org.datastructure.arrays.problems;

import java.security.InvalidParameterException;

public class LongestPalindromicSubstring {

    /**
     * Given an string, word, check which are the longest palindromic substring on it.
     * 
     * A substring is a continuous sequence of characters.
     * 
     * @param word
     * @return an integer representing the longest palindromic substring size
     * 
     * QUESTIONS:
     * 1. As the input size can be something between 1 and 1000, in case of one, 
     * should we consider it as a valid palindromic substring?
     * 2. Should we assume we will always have a valid response?
     * 
     * EXAMPLES:
     * 
     * 1º
     * word = "galinhadosovoshe"
     * output = 5 (sovos);
     * 
     * 2º
     * word = "akkkkkka"
     * output = 8 (akkkkkka)
     * 
     * 3º
     * word = "aaaaaaaaaa"
     * output = 10 (aaaaaaaaaa)
     * 
     * 4º
     * word = paralelepipedoamareloeazuldacordoceu
     * output = 3 (ele)
     * 
     * 5º
     * word = az
     * output = 1 (a or z)
     */
    public int longestPalindromicSubstring(String word) {
        if(word == null) throw new InvalidParameterException();

        if(word.length() == 1) return 1;

        int finalLeft = 0;
        int finalRight = 0;

        for(int i = 0; i < word.length(); i++) {
            int lenghtOdd = expandAroundCenter(i, i, word);
            int lenghtNonOdd = expandAroundCenter(i, i + 1, word);

            int validLenght = Math.max(lenghtOdd, lenghtNonOdd);

            if (validLenght > (finalRight - finalLeft + 1)) {
                finalLeft = i - (validLenght - 1) / 2;
                finalRight = i + validLenght / 2;
            }
        }

        return finalRight - finalLeft + 1;
    }

    private int expandAroundCenter(int left, int right, String word) {
        while(left >= 0 && right < word.length() && word.charAt(left) == word.charAt(right)) {
            left--;
            right++;
        }

        return right - left - 1;
    }
}
