package main.org.datastructure.arrays.problems;

public class Subsequence {
    /**
     * Check whether or not an string is a subsequence of the other.
     * 
     * @param s
     * @param t
     * @return whether or not one string is the subsequence of the other
     * 
     * Asymptomatic analysis:
     * Time: O(N + M);
     * Space: O(1);
     */
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }

        return i == s.length();
    }
}
