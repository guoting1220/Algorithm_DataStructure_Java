public class Solution {
    public int calculate(String s) {
        if(s==null || s.length()==0) return 0;
        Stack<Integer> stack = new Stack<Integer>();
        char sign = '+';
        int num = 0;
        
        for(int i=0; i<s.length()+1; i++){
            if(i<s.length() && s.charAt(i)==' ') continue;
            if(i<s.length() && Character.isDigit(s.charAt(i))) {
                num = num*10 + s.charAt(i) - '0';
                continue;
            }
            switch(sign){
                case '+':
                    stack.push(num);  
                    break;   // !! don't forget!!
                case '-':
                    stack.push(-num); 
                    break;
                case '*':
                    stack.push(stack.pop()*num);
                    break;
                case '/':
                    stack.push(stack.pop()/num); 
                    break;
            }
         
            if(i<s.length()) sign = s.charAt(i);
            num = 0;
        }
        
        while(!stack.isEmpty()) num += stack.pop();
        return num;
    }
}