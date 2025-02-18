import java.math.BigInteger;

class Solution {
    public String addBinary(String a, String b) {
        BigInteger binaryA = new BigInteger(a, 2);
        BigInteger binaryB = new BigInteger(b, 2);
        BigInteger zero = new BigInteger("0", 2);
        BigInteger addResult, carryOver;

        while (binaryB.compareTo(zero) != 0) {
            addResult = binaryA.xor(binaryB);
            carryOver = binaryB.and(binaryA).shiftLeft(1);

            binaryA = addResult;
            binaryB = carryOver;
        }

        return binaryA.toString(2);
    }
}