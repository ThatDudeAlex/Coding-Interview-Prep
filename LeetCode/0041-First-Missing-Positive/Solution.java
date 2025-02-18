class Solution {
    public int firstMissingPositive(int[] nums) {
        HashMap<Integer, Integer> postiveNumbers = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (!postiveNumbers.containsKey(nums[i]) && nums[i] > 0)
                postiveNumbers.put(nums[i], nums[i]);
        }

        for (int i = 0; i <= nums.length; i++) {
            if (!postiveNumbers.containsKey(i + 1))
                return i + 1;
        }

        return nums.length + 1;
    }
}