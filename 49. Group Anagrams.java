public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<List<String>>();
        List<String> list = new ArrayList<String>();
        if(strs==null || strs.length==0){
            result.add(list);
            return result;
        }
        HashMap<String, List<String>> map = new  HashMap<String, List<String>>();
        String sorted = "";
        List<String> valueList = new ArrayList<String>();
        for(String k : strs){
            sorted = sortString(k);
            if(!map.containsKey(sorted)){
                valueList = new ArrayList<String>();
                valueList.add(k);
                map.put(sorted, valueList);
            }
            else map.get(sorted).add(k);
        }
        for(List<String> k : map.values()) {
            Collections.sort(k);   // the way to sort ArrayList  !!!! to sort array: Arrays.sort(arr);
            result.add(k);
        }
        return result;
    }
    
    public String sortString(String s){
        if(s==null || s.length()<=1) return s;
        char[] a = s.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }
}