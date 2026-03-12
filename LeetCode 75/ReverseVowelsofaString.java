//Reverse Vowels of a String
//The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
//Example 1:
//Input: s = "IceCreAm"
//Output: "AceCreIm"
//Explanation:
//The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".

// solved using two pointer start and end ittirated to find a vowel and once found swapped

class Solution {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        String vowels = "AEIOUaeiou";
        int start = 0, end = s.length()-1;

        while (start < end)
        {
            //ittirates from start of the string until we find a vowel indexOf returns index if vowel is found 
            while(start<end && vowels.indexOf(chars[start]) == -1)
                start++;
            //similarly from other side of the array
            while (start<end && vowels.indexOf(chars[end]) == -1)
                end--;
            // if vowel is found at both ends swap
            if(start<end)
            {
                char ch = chars[start];
                chars[start] = chars[end];
                chars[end] = ch;
            }
            //increment pointers
            start++;
            end--;
        }
         return new String(chars);
    }
}
