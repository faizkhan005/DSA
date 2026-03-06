// Merge Strings Alternately
// example word1 = abc and word2 = poi then result = apboci.
// if 1 word is longer than other append the rest of the word at end.
// There are two approaches to this problem 
// 1. Using two pointers i & j
// i contains length of word1 and j contains length of word2
// we itterate over both words inside a while loop building the desired string.
// 2. using single pointer i
// i contains Math.max(word1.length(), word2.length())
// and we follow the same precedure and itterate over both words if i < word1.length() then move to word2 or vice versa.
class Solution {
    public String mergeAlternately(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < Math.max(m,n); i++)
        {
            if(i < m)
            {
                result.append(word1.charAt(i));
            }
            if(i < n)
            {
                result.append(word2.charAt(i));
            }
        }
       
        return result.toString();
    }
}
