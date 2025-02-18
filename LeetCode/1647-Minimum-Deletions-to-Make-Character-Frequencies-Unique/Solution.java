class Solution {
    public int minDeletions(String s) {
        HashMap<Character, Integer> frequencyMap = getStringFrequencyMap(s);

        return getMinimumDeletions(frequencyMap);
    }

    private int getMinimumDeletions(HashMap<Character, Integer> frequencyMap) {
        int minDeletions = 0;

        Set<Integer> set = new HashSet();

        for (Integer frequency : frequencyMap.values())
            while (frequency != 0 && !set.add(frequency--))
                minDeletions++;

        return minDeletions;
    }

    private HashMap<Character, Integer> getStringFrequencyMap(String s) {
        HashMap<Character, Integer> frequencyMap = new HashMap<Character, Integer>();

        for (char letter : s.toCharArray())
            frequencyMap.put(letter, frequencyMap.getOrDefault(letter, 0) + 1);

        return frequencyMap;
    }
}