public class Solution {
    public boolean isPalindrome(int x) {
        //reverse the int first (use double in case of over flow)
        double reversed = 0;
        int copyX = x;
        while(x>0){
            reversed = reversed * 10 + x % 10;
            x = x / 10;
        }
        return copyX==reversed;  // int and double can be equal as long as they have exactly the same values
    }
}