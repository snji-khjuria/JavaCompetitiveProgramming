/*Algorithm:
put indices of all the seen characters into hashmap and keep looking for diff in the hashmap w.r.t. target 
we want to achieve. if that diff exist hence both the indices are present so return those indices.
*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++) {
            int diff = target - nums[i];
            if(hm.containsKey(diff)) {
                result[0] = hm.get(diff);
                result[1] = i;
                return result;
            }
            hm.put(nums[i], i);
        }
        return result;
    }
}
