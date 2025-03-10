class Solution {
    public int arraySign(int[] nums) {
        int product = 1;

        for (int num : nums)
            if (num > 0)
                product *= 1;
            else if (num < 0)
                product *= -1;
            else if (num == 0)
                return 0;

        return product;
    }
}