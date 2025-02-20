public class Solution {
    private static final int MOD = 1337;

    public int superPow(int a, int[] b) {
        a %= MOD;
        int result = 1;
        for (int i = b.length - 1; i >= 0; i--) {
            result = (result * modPow(a, b[i])) % MOD;
            a = modPow(a, 10);
        }
        return result;
    }
    private int modPow(int x, int n) {
        int result = 1;
        x %= MOD;
        while (n > 0) {
            if ((n % 2) == 1) {
                result = (result * x) % MOD;
            }
            x = (x * x) % MOD;
            n /= 2;
        }
        return result;
    }
}
