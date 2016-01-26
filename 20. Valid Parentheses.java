public class Solution {
    public boolean isValid(String s) {
        if(s==null || s.length()==0) return true;
        Stack<Character> stack = new Stack<Character>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='[' || s.charAt(i)=='(' || s.charAt(i)=='{') stack.push(s.charAt(i));
            else if (s.charAt(i)==']'){
                if(stack.isEmpty() || stack.pop()!='[') return false;
            }
            else if (s.charAt(i)==')'){
                if(stack.isEmpty() || stack.pop()!='(') return false;
            }
            else if (s.charAt(i)=='}'){
                if(stack.isEmpty() || stack.pop()!='{') return false;
            }
        }
        return stack.isEmpty();
    }
}