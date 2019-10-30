/*Algorithm
start from lsb till msb and if you find non 9 digit make it 9 and return
else: create more than one old length and make msb==1.
*/
class Solution {
    public int[] plusOne(int[] digits) {
        int i=digits.length-1;
        while(i>=0) {
            if(digits[i]!=9) {
                digits[i]+=1;
                return digits;
            }
            digits[i]=0;
            i--;
        }
        int[] result = new int[digits.length+1];
        result[0] = 1;
        return result;
    }
}
