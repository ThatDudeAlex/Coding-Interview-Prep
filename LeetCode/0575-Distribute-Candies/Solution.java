class Solution {
    public int distributeCandies(int[] candyType) {
        int half = candyType.length / 2;
        int maxNumberOfType = 0;
        Set<Integer> numTypes = new HashSet();

        for (int candy : candyType) {
            if ((maxNumberOfType < half) && numTypes.add(candy))
                maxNumberOfType++;
            if (maxNumberOfType == half)
                return maxNumberOfType;
        }

        return maxNumberOfType;
    }
}