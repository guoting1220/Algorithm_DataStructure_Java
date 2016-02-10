public class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] s = str.split(" ");
        List<String> arr = new ArrayList<String>();
        for(int i=0; i<s.length; i++){
            if(!s[i].equals("")) arr.add(s[i]);  // in case there are more than 1 space between two words in str
        }
        if(pattern.length() != arr.size()) return false;
        HashMap<Character, String> map = new HashMap<Character, String>();
        for(int i=0; i<pattern.length(); i++){
            if(!map.containsKey(pattern.charAt(i))){
                if(map.containsValue(arr.get(i))) return false;
                map.put(pattern.charAt(i), arr.get(i));
            }
            else{
                if(!map.get(pattern.charAt(i)).equals(arr.get(i))) return false;
            }
        }
        return true;
    }
}