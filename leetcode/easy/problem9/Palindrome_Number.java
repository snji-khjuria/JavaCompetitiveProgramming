/*Algorithm
1. Negative numbers can not be palindrome
2. reverse the number and check if it overflows return false
3. else compare with the input number and return
*/

class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        long xx = 0;
        int y=x;
        while(x>0) {
            xx=xx*10+x%10;
            x/=10;
        }
        if(xx>=Integer.MAX_VALUE)
            return false;
        return ((int)xx)==y;
    }
}
