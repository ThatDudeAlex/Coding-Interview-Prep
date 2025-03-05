
class Solution {

  public int[] sortedSquaredArray(int[] array) {
    // Write your code here.
		int[] squared = new int[array.length];
		int leftPointer   = 0;
		int rightPointer  = array.length - 1;
		int squaredIndex  = rightPointer;
		
		while (leftPointer <= rightPointer) {
			int leftSquared   = array[leftPointer]  * array[leftPointer];
			int rightSquared  = array[rightPointer] * array[rightPointer];
						
			if (leftSquared > rightSquared) {
				squared[squaredIndex--] = leftSquared;
				leftPointer++;
			}
			else if(rightSquared >= leftSquared) {
				squared[squaredIndex--] = rightSquared;
				rightPointer--;
			}
		}
		
		return squared;
  }
}
