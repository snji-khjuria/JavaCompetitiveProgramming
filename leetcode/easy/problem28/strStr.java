/*
Algorithm:
1. if needle is empty return 0
2. My potential substring locations are from 0, 1, 2, ....hay-needle because [(hay-needle) + needle-1]==hay-1.
so the loop is from i=0 to hay-needle.
*/


class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.equals(""))
            return 0;
        for(int i=0; i<=haystack.length()-needle.length(); i++) {
            String temp = haystack.substring(i, i+needle.length());
            if(temp.equals(needle))
                return i;
        }
        return -1;
    }
}
