/*
Algortihm
start from lsb to msb and create the sum from both the strings. get the lsb from sum by %2 arithmetic
right shift the number now to get the carry. if there is any carry after the process add it to result
*/

class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder("");
        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;
        while(i>=0 || j>=0) {
            int sum=carry;
            if(i>=0)
                sum+=a.charAt(i--)-'0';
            if(j>=0)
                sum+=b.charAt(j--)-'0';
            sb.insert(0, (char)(sum%2+'0'));
            carry=sum>>1;
        }
        if(carry!=0)
            sb.insert(0, '1');
        return sb.toString();
        
    }
}
