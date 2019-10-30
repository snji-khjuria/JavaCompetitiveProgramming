/*
Algorithm:
Classic Kadane algorithm.
from recursion expect it to return the suffix sum as well and in the inductive step ask the call to fill
sum and suffix sum by following rule:-
1. suffix sum =max(olfsuffixsum+currentelement, currentelement)
2. sum  = max(oldsum, suffixsum)
*/

class Solution {
    class Result{
        int result;
        int suffixresult;
    }
    public int maxSubArray(int[] nums) {
        Result r = findSum(nums, nums.length-1);
        return r.result;
    }
    private Result findSum(int[] arr, int index) {
        if(index==0) {
            Result r = new Result();
            r.result = r.suffixresult=arr[index];
            return r;
        }
        Result temp = findSum(arr, index-1);
        temp.suffixresult = Math.max(temp.suffixresult+arr[index], arr[index]);
        temp.result = Math.max(temp.result, temp.suffixresult);
        return temp;
    }
}
