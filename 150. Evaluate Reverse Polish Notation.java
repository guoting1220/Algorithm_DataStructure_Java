public class Solution {
    public int evalRPN(String[] tokens) {
        if(tokens==null || tokens.length==0) return 0;
        int a, b;
        Stack<Integer> stack = new Stack<Integer>();
        for(String k : tokens){
            if(k.equals("+")){
                b = stack.pop();
                a = stack.pop();
                stack.push(a+b);
            }
            else if(k.equals("-")){
                b = stack.pop();
                a = stack.pop();
                stack.push(a-b);
            }
            else if(k.equals("*")){
                b = stack.pop();
                a = stack.pop();
                stack.push(a*b);
            }
            else if(k.equals("/")){
                b = stack.pop();
                a = stack.pop();
                stack.push(a/b);
            }
            else stack.push(Integer.parseInt(k));
        }
        return stack.pop();
    }
}