public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        String binaryForm = Integer.toBinaryString(n);
        return getHammingWeight(binaryForm);
    }

    private int getHammingWeight(String binaryForm) {
        int count = 0;
        char[] binary = binaryForm.toCharArray();

        for (char c : binary)
        if (c == '1')
            count++;

        return count;
    }
}