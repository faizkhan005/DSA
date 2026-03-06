//Greatest Common Divisor of Strings
// for example Input: str1 = "ABCABC", str2 = "ABC" Output: "ABC"
// Solution
// Check if the string's contain a greates common devisor 
// add both the strings in different order if both are same then it contains substring 
// Use Euclidean algorithm.
// example of how gcd function works 
//Find gcd(48, 18):
//gcd(48, 18) → gcd(18, 48 % 18) → gcd(18, 12)
//gcd(18, 12) → gcd(12, 18 % 12) → gcd(12, 6)
//gcd(12, 6) → gcd(6, 12 % 6) → gcd(6, 0)
//Now y == 0, return 6

class Solution {
    public int gcd(int x, int y)
    {
        if(y == 0)
            return x;
        else
            return gcd(y, x % y);
    }
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1 + str2).equals(str2 + str1))
        {
            return "";
        }
        int gcdLength = gcd(str1.length(), str2.length());
        return str1.substring(0,gcdLength);
        
    }
}
