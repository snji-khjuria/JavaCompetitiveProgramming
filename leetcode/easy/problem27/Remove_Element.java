/*
Algorithm:
1. From first element till the end if nums[i]!=value add the value to index
*/

class Solution {
    public int removeElement(int[] nums, int val) {
        int index=0;
        for(int i=0; i<nums.length; i++)
            if(nums[i]!=val)
                nums[index++]=nums[i];
        return index;
    }
}
