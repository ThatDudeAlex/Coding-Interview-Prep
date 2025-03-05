
class Solution {

  private class ArrayInfo {
    int numZeros;
    int maxProduct;

    public ArrayInfo(int numZeros, int maxProduct) {
      this.numZeros = numZeros;
      this.maxProduct = maxProduct;
    }
  }

  public int[] arrayOfProducts(int[] array) {
    // Write your code here.
    ArrayInfo info = getArrayInfo(array);

    if (info.numZeros > 1) {
      return new int[array.length];
    }

    return createOutputArray(array, info);
  }

  private ArrayInfo getArrayInfo(int[] array) {
    int numZeros = 0;
    int maxProduct = 1;

    for (int element : array) {
      if (element == 0) {
        numZeros++;
      } else {
        maxProduct *= element;
      }
    }

    return new ArrayInfo(numZeros, maxProduct);
  }

  private int[] createOutputArray(int[] array, ArrayInfo info) {
    int[] output = new int[array.length];

    for (int i = 0; i < array.length; i++) {
      if (info.numZeros == 1 && array[i] != 0) {
        output[i] = 0;
      } else if (info.numZeros == 1 && array[i] == 0) {
        output[i] = info.maxProduct;
      } else {
        output[i] = (info.maxProduct / array[i]);
      }
    }

    return output;
  }
}
