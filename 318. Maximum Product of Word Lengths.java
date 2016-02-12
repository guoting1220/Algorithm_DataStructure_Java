public class Solution {
    public int maxProduct(String[] words) {
        int[] a = new int[words.length]; // bit number representing the characters existed in each word, e.g "bc"-->110 (3)
        int x;
        int max = 0;
        for(int i=0; i<a.length; i++){
            for(int j=0; j<words[i].length(); j++){
                x = 1 << (words[i].charAt(j) - 'a');
                a[i] |= x;
            }
        }
        
        for(int i=0; i<a.length-1; i++){
            for(int j=i+1; j<a.length; j++){
                if((a[i]&a[j])==0) max = Math.max(max, words[i].length() * words[j].length()); //(a[i]&a[j]) must be in ()
            }
        }
        
        return max;
    }
}