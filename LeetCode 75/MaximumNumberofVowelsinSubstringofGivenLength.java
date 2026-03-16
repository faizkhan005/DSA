//Maximum Number of Vowels in a Substring of Given Length
//Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.
//Input: s = "abciiidef", k = 3
//Output: 3
//Explanation: The substring "iii" contains 3 vowel letters.
// using slinding window left and right pointer to create a window and identify if the window is valid or not if not move to next window.
class Solution {
    public int maxVowels(String s, int k) {
        int i = 0, j = 0;
        char[] chars = s.toCharArray();
        int max = Integer.MIN_VALUE;
        int count = 0;
        String vowels = "aeiou";
        while ( j < chars.length)
        {
            if(vowels.indexOf(chars[j]) != -1)
                count++;
            if(j-i+1 < k)
                j++;
            else if (j-i+1 == k)
            {
                max = Math.max(max,count);
                if(vowels.indexOf(chars[i]) != -1)
                    count--;
                i++;
                j++;
            }
        }
        return max;
    }
}
