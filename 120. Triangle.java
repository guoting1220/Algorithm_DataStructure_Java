public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int min = (n==1)? triangle.get(0).get(0) : Integer.MAX_VALUE;
        for(int i=1; i<n; i++){
            for(int j=0; j<=i; j++){
                if(j==0) triangle.get(i).set(0, triangle.get(i).get(0) + triangle.get(i-1).get(0));
                else if(j==i) triangle.get(i).set(i, triangle.get(i).get(i) + triangle.get(i-1).get(i-1)); 
                else triangle.get(i).set(j, triangle.get(i).get(j) + Math.min(triangle.get(i-1).get(j-1), triangle.get(i-1).get(j)));
                
                if(i==n-1) min = Math.min(min, triangle.get(i).get(j));
            }
        }
        return min;
    }
}