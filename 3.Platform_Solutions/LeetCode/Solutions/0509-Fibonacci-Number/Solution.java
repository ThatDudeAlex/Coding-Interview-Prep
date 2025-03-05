class Solution {
    public int fib(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        return getFib(n);
    }

    private int getFib(int n) {
        int[] fibSequence = { 0, 1 };

        for (int i = 1; i < n; i++)
            addFibVal(fibSequence, fibSequence[0] + fibSequence[1]);

        return fibSequence[1];
    }

    private void addFibVal(int[] fibSequence, int fibVal) {
        fibSequence[0] = fibSequence[1];
        fibSequence[1] = fibVal;
    }

}