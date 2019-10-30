/*
Algorithm:
your goal is to search and hence use the binary search to reach at m s.t. m*m==x
1. once the loop terminate it means s>e and before that if would have been at s==e
so check if s*s>x which means you reach more index so return s-1 else e moved and hence return s 
*/

class Solution {
    public int mySqrt(int x) {
    long s = 0, e=x;
        while(s<=e){
            long mid = s+(e-s)/2;
            long num = mid*mid;
            if(num==x)return (int)mid;
            if(num>x)
                e=mid-1;
            else
                s=mid+1;
        }
        if(s*s>x)
            return (int)s-1;
        return (int)s;
    }
}
