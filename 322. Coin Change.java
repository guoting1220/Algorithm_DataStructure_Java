public class Solution {
    public static int coinChange(int[] coins, int amount) {
        if (coins == null || coins.length == 0 || amount <= 0) return 0;
        int[] a = new int[amount + 1];
        for (int i = 1; i <= amount; i++) {
            a[i] = Integer.MAX_VALUE;
            for (int k : coins) {
                if (k <= i && a[i-k] != Integer.MAX_VALUE)
                    a[i] = Math.min(a[i], 1 + a[i-k]);
            }
        }
        if (a[amount] == Integer.MAX_VALUE)  return -1;
        return a[amount];
    }
}