/*
Algorithm:
if list is empty: return
else consider first element as prefix and call recursively on each element of the list
and produce the prefix and if at any stage the prefix becomes empty return the "" string as prefix
*/


class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length==0)
            return "";
        String answer = strs[0];
        for(int i=1; i<strs.length; i++) {
            answer = findPrefix(answer, strs[i]);
            if(answer.equals(""))
                return "";
        }
        return answer;
    }
    private String findPrefix(String s, String t) {
        StringBuffer sb = new StringBuffer("");
        for(int i=0; i<s.length(); i++) {
            if(t.length()<=i || s.charAt(i)!=t.charAt(i))
                return sb.toString();
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
