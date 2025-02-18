class Solution {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        int half = n / 2;

        if (n == 0)
            return new int[] {};
        if (n == 1)
            return new int[] { 0 };
        if (n == 2)
            return new int[] { -1, 1 };

        for (int i = 0, j = n - 1; i < n / 2; i++, j--) {
            ans[i] = half * -1;
            ans[j] = half;
            half--;
        }

        return ans;
    }
}