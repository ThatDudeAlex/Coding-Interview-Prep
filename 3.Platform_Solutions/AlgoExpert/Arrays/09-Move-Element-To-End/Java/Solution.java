import java.util.*;

class Solution {
  public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
    // Write your code here.
    int startPointer = 0;
    int endPointer = array.size() - 1;
    
    while (endPointer > startPointer) {
        int startValue = array.get(startPointer);
        int endValue = array.get(endPointer);
        
        if (endValue == toMove) {
            endPointer -= 1;
        }
        else if (startValue != toMove) {
            startPointer += 1;
        }
        else if (startValue == toMove) {
            swap(startPointer, endPointer, array);
            startPointer += 1;
            endPointer -= 1;
        }
    }
		
    return array;
  }
	
  private static void swap(int index1, int index2, List<Integer> array) {
    Integer temp = array.get(index1);
    array.set(index1, array.get(index2));
    array.set(index2, temp);
  }
}
