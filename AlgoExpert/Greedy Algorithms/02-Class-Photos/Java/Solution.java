import java.util.*;

class Solution {
  
  public boolean classPhotos(
  ArrayList<Integer> redShirtHeights, ArrayList<Integer> blueShirtHeights) {
    
    Collections.sort(redShirtHeights);
    Collections.sort(blueShirtHeights);
    
    ArrayList<Integer> backRow;
    ArrayList<Integer> frontRow;
    
    if (redShirtHeights.get(0) == blueShirtHeights.get(0)) {
      return false;
    }
    else if (redShirtHeights.get(0) > blueShirtHeights.get(0)) {
      backRow = redShirtHeights;
      frontRow = blueShirtHeights;
    }
    else {
      backRow = blueShirtHeights;
      frontRow = redShirtHeights;
    }
    
    return canTakePhoto(backRow, frontRow);
  }
  
  private static boolean canTakePhoto(ArrayList<Integer> backRow, ArrayList<Integer> frontRow) {
    for (int i = 1; i < backRow.size(); i++) {
      if (backRow.get(i) <= frontRow.get(i)) {
        return false;
      }
    }
    return true;
  }
  
}

