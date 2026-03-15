//Is Subsequence
//Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
//A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without
//disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
//Example 1:
//Input: s = "abc", t = "ahbgdc"
//Output: true
//Example 2:
//Input: s = "axc", t = "ahbgdc"
//Output: false
// Solution using two pointers i and j; i ittirates over string s and j ittierates over string t;
// for each element in s we compare it in j we keep incrementing j until we find the match as soon as we find the match we increment i and j 
// if we have traveresed entierly through i then return true else return false
class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        while (i < s.length() && j < t.length() )
        {
            while (j < t.length() && t.charAt(j) != s.charAt(i))
                j++;
            if(j < t.length() && i<s.length() && t.charAt(j) == s.charAt(i))
            {
                i++;
                j++;
            }
        }
        return i == (s.length());
    }
}
