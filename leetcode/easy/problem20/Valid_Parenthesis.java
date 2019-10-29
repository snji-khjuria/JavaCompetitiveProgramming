/*Algorithm
1. if empty string return true
2. create a stack and push every (, {, [ onto stack
3. whenever ),},] comes it should match with top of stack with (, {, [
4. if it fails return false
5. in the end return true if stack is empty else return false
*/

class Solution {
    public boolean isValid(String s) {
        if(s==null || s.length()==0)
            return true;
        Stack<Character> stk = new Stack<Character>();
        for(char ch:s.toCharArray()) {
            if(ch=='(' || ch=='{' || ch=='[')
                stk.push(ch);
            else if(ch==')' && !stk.isEmpty() && stk.peek()=='(')
                stk.pop();
            else if(ch=='}' && !stk.isEmpty() && stk.peek()=='{')
                stk.pop();
            else if(ch==']' && !stk.isEmpty() && stk.peek()=='[')
                stk.pop();
            else
                return false;
        }       
        return stk.isEmpty();
    }
}
