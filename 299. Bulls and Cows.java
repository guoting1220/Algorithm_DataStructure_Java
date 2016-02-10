public class Solution {
    public String getHint(String secret, String guess) {
        int[] arr = new int[10];
        int a = 0; 
        int b = 0;
        for(int i=0; i<secret.length(); i++){
            if(secret.charAt(i)==guess.charAt(i)) a++;
            else{
                if(arr[secret.charAt(i)-'0']<0) b++;
                arr[secret.charAt(i)-'0']++;
                if(arr[guess.charAt(i)-'0']>0) b++;
                arr[guess.charAt(i)-'0']--;
            }
        }
        StringBuffer sb = new StringBuffer();
        sb.append(a);
        sb.append('A');
        sb.append(b);
        sb.append('B');
        
        return sb.toString();
    }
}