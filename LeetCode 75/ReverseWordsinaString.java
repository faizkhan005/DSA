//Reverse Words in a String
// example "Hellow   World" to "World Hello" need to make sure extraspaces and leading spaces are removed 
//approach
// using two pointers split the word into array 
//use start and end pointer to swap words and then join the array

class Solution {
    public String reverseWords(String s) {
        String[] wordsArray = s.trim().split("\\s+");
        int start = 0, end = wordsArray.length -1;
        while(start<end)
        {
            String temp = wordsArray[start];
            wordsArray[start] = wordsArray[end];
            wordsArray[end] = temp;
            start++;
            end--;
        }
        return String.join(" ",wordsArray);
    }
}

//time complexity O(N)
//space Complexity O(N)
