public class Solution {
    public String simplifyPath(String path) {
        if(path==null || path.length()==0) return path;
        String[] s = path.split("/");
        Stack<String> stack = new Stack<String>();
        StringBuffer sb = new StringBuffer();
        
        for(String k : s){
            if(k.equals("") || k.equals(".")) continue;
            if(k.equals("..")){
                if(!stack.isEmpty()) stack.pop();
                continue;
            }
            stack.push(k);
        }
        
        if(stack.isEmpty()) return "/";
        
        while(!stack.isEmpty()){
            sb.insert(0, stack.pop());
            sb.insert(0, "/");
        }

        return sb.toString();
    }
}