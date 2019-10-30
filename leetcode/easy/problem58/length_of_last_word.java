/*
Algorithm:
first reach at non space character from the end and then find the index of space.
last index= first nonwhite space andyou are at index implies total chars = last-index
*/

class Solution {
    public int lengthOfLastWord(String s) {
        if(s==null || s.length()==0)
            return 0;
        int i=s.length()-1;
        while(i>=0 && s.charAt(i)==' ')
            i--;
        if(i<0)
            return 0;
        int lastIndex=i;
        while(i>=0 && s.charAt(i)!=' ')
            i--;
        return lastIndex-i;
    }
}
