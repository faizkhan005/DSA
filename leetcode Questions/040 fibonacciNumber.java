class Solution {
    public int fib(int n) {
        if(n<2) return n;
        return fib(n-1)+fib(n-2);
    }
}

// best solution use long isntead of int for large number
class Solution {
    public int fib(int n) {
       return (int)((Math.pow(((1+Math.sqrt(5))/2),n)-Math.pow(((1-Math.sqrt(5))/2),n))/Math.sqrt(5));
    }
}
