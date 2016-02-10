public class Solution {
    // you need treat n as an unsigned value
   public int reverseBits(int n) {
      int sum = 0;
      for(int i=0; i<32; i++){ // can not use while(n>0)!! if 0000011 should be 1100000 not 11
          sum = (n & 1) + sum * 2;  //!!! USE ( ) !!
          n = n>>1;
      }
      return sum;
  }
}