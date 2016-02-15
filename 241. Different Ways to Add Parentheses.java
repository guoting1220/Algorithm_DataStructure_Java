public class Solution {
    public List<Integer> diffWaysToCompute(String input) {
        List<Integer> result = new ArrayList<Integer>();
        if(input==null || input.length()==0) return result;
        if(input.indexOf('+')==-1 && input.indexOf('-')==-1 && input.indexOf('*')==-1) {
            result.add(Integer.parseInt(input));
            return result;
        }
       // List<Integer> left;
       // List<Integer> right;
        char o = ' ';
        for(int i=0; i<input.length(); i++){
            o = input.charAt(i);
            if(!Character.isDigit(o)){
                 List<Integer> left = diffWaysToCompute(input.substring(0, i));
                 List<Integer> right = diffWaysToCompute(input.substring(i+1));
                 for(int k : left){
                    for(int s : right){
                        switch(o){
                            case '+':
                                result.add(k + s);
                                break;
                            case '-':
                                result.add(k - s);
                                break;
                            case '*':
                                result.add(k * s);
                        }
                    }
                }
            }
        }
        return result;
    }
}