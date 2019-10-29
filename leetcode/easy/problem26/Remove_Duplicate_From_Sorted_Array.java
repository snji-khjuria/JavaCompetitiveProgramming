/*
Algorithm:
1. First element is always non-duplicate, so start from second element
2. Start from second till end and compare it with previous element if it is different from it hence add else ignore
*/

class Solution {
    public int removeDuplicates(int[] nums) {
        int index=1;
        for(int i=0; i<nums.length-1; i++) {
            if(nums[i]!=nums[i+1])
                nums[index++]=nums[i+1];
        }
        return index;
    }
}
