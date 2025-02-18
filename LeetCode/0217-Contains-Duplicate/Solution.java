class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> uniqueNums = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            Integer num = nums[i];
            if (uniqueNums.contains(num)) {
                return true;
            }

            uniqueNums.add(num);
        }

        return false;
    }
}