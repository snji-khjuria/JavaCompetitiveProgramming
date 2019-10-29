/*
Algorithm:
1. keep searching till left<=right and if success happens with binary search return that element
2. But if you returned from the binary search unsuccessfully:-
   a) Before last iteration l==r and left moves i.e. a[l]<target and current left will be the insert position
   b) Before last iteration l==r and right moves i.e. a[l]>target and hence this left will be the insert position

Long story short: if I fail to find the element in array using binary search then according to binary search before failing
the loop both elements would be equal and then in next iteration left or right pointer changes. but if left pointer changes
then it means this element was small so return left and if right pointer changes it means this element was big so return left
in both the cases.
*/


class Solution {
    public int searchInsert(int[] nums, int target) {
        int l =0, r=nums.length-1;
        while(l<=r) {
            int mid = l+(r-l)/2;
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]>target)
                r=mid-1;
            else
                l=mid+1;
        }
        return l;
    }
}
