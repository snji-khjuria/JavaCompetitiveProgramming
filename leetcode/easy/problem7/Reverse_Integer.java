/*
1. Remove sign from the number
2. Reverse the number
3. Check if overflows then return 0 else return the reverse number w.r.t. sign we found
*/
class Solution {
    public int reverse(int x) {
        int sign=1;
        sign = x<0?-1:1;
        if(x<0)
            x*=-1;
        long rev=0;
        while(x>0) {
            int digit = x%10;
            x/=10;
            rev=rev*10+digit;
        }
        return rev>=Integer.MAX_VALUE?0:sign*(int)rev;
        
    }
}
