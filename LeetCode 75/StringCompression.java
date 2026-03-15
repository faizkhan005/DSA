//String Compression
//Input: chars = ["a","a","b","b","c","c","c"]
//Output: 6
//Explanation: The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".
//Note: The characters in the array beyond the returned length do not matter and should be ignored.
// explantion using two pointers; i ittirates over entier array and index that keeps track of new array length;
// now using while loop we ittirate over array and find count of duplicate elements (note its a sorted array and elements are next to each other)
// once you find the count replace the array with element and if count > 1 its count 
class Solution {
    public int compress(char[] chars) {
        int index = 0;
        int i = 0;
        while(i < chars.length)
        {
            char current = chars[i];
            int count = 0;
            while(i < chars.length && chars[i] == current)
            {
                i++;
                count ++;
            }
            chars[index++] = current;
            if(count > 1)
            {
                for (char c : String.valueOf(count).toCharArray())
                    chars[index++] = c;
            }
        }
        return index;
    }
}
