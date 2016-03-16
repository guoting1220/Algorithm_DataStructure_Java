public class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if(denominator==0) return null;
        if(numerator==0) return "0";
        boolean neg = (numerator<0 && denominator>0) || (numerator>0 && denominator<0);
        long num = Math.abs((long)numerator);
        long de = Math.abs((long)denominator);
        StringBuffer sb = new StringBuffer();
        sb.append(num/de);
        if(num%de!=0){
            sb.append(".");
            HashMap<Long, Integer> map = new HashMap<Long, Integer>();
            while(num%de!=0){
                num = num%de*10;
                if(!map.containsKey(num)){
                    sb.append(num/de);
                    map.put(num, sb.length()-1);
                }
                else{
                    sb.insert(map.get(num), "(");
                    sb.append(")");
                    break;
                }
            }
        }
        if(neg) sb.insert(0, "-");
        return sb.toString();
    }
}