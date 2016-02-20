public class Solution {
    public boolean isValidSerialization(String preorder) {
        if(preorder==null || preorder.length()==0) return false;
        String[] s = preorder.split(",");
        Stack<String> stack = new Stack<String>();
        
        for(int i=0; i<s.length; i++){
            if(!s[i].equals("#")) stack.push(s[i]);
            else{
                while(!stack.isEmpty() && stack.peek().equals("#")){
                    stack.pop();
                    if(stack.isEmpty()) return false;
                    stack.pop();
                }
                stack.push("#");
            }
        }
        return stack.size()==1 && stack.peek().equals("#");
    }
}