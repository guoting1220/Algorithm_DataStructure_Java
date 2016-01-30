public class NumArray {
    int[] arr;
    public NumArray(int[] nums) {  //constructor
        arr = nums;
        for(int i=1; i<arr.length; i++){
            arr[i] += arr[i-1];
        }
    }

    public int sumRange(int i, int j) {
        if(i==0) return arr[j];
        return arr[j] - arr[i-1];
    }
}


// Your NumArray object will be instantiated and called as such:
// NumArray numArray = new NumArray(nums);
// numArray.sumRange(0, 1);
// numArray.sumRange(1, 2);