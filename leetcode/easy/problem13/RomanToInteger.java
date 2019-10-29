/*
Algorithm:
1. if empty string do nothing.
2. start from right to left and if the current character is > prev add its value
3. else remove its value from the previous sum and finally return the answer.
*/

class Solution {
    public int romanToInt(String s) {
        if(s==null || s.length()==0)
            return 0;
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        hm.put('I', 1);hm.put('V', 5);hm.put('X', 10);hm.put('L', 50);
        hm.put('C', 100);hm.put('D', 500);hm.put('M', 1000);
        
        int result=0;
        int prev=0;
        for(int i=s.length()-1; i>=0; i--) {
            int current = hm.get(s.charAt(i));
            if(current>=prev)
                result+=current;
            else
                result-=current;
            prev=current;
        }
        return result;
    }
}
