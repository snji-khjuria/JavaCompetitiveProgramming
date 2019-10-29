/*
Algorithm
1. Do the loop for all the indices 
2. for current row check if length is only once implies count that character with==1 and return
3. else take the current character and count its occurence and return recursively.
*/


class Solution {
    public String countAndSay(int n) {
        String ans = "1";
        for(int i=2; i<=n; i++) {
            ans = giveMeAns(ans);
        }
        return ans;
    }
    private String giveMeAns(String ans) {
        if(ans.length()==1)
            return "1"+ans;
        char ch = ans.charAt(0);
        int count=0, i=0;
        while(i<ans.length() && ans.charAt(i)==ch)
            i++;
        String current = (i)+"" + ch;
        if(i==ans.length())
            return current;
        return current+giveMeAns(ans.substring(i));
        
    }
}
