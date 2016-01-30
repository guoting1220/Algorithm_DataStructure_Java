public class Solution {
    public int compareVersion(String version1, String version2) {
        String[] a1 = version1.split("\\.");
        String[] a2 = version2.split("\\.");
        int i=0, j=0;
        int n1, n2;
        while(i<=a1.length-1 || j<=a2.length-1){
            n1 = (i>a1.length-1) ? 0 : Integer.parseInt(a1[i]);  //1.2.0 == 1.2 !!
            n2 = (j>a2.length-1) ? 0 : Integer.parseInt(a2[j]);
            if(n1<n2) return -1;
            else if(n1>n2) return 1;
            i++;
            j++;
        }
        return 0;
    }
}