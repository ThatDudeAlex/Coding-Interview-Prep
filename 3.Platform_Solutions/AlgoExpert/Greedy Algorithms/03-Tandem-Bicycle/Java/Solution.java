import java.util.*;

class Solution {
  public int tandemBicycle(
  int[] redShirtSpeeds, int[] blueShirtSpeeds, boolean fastest
  ) {
    // Write your code here.
    int totalSpeed = 0;
    
    if (redShirtSpeeds.length == 1) {
      return (redShirtSpeeds[0] > blueShirtSpeeds[0]) ? redShirtSpeeds[0] : blueShirtSpeeds[0];
    }
    
    Arrays.sort(redShirtSpeeds);
    Arrays.sort(blueShirtSpeeds);
    
    for (int i = 0; i < redShirtSpeeds.length; i++) {
      int red = 0;
      int blue = blueShirtSpeeds[i];
      
      if (fastest) {
        red = redShirtSpeeds[redShirtSpeeds.length - (1 + i)];
      } else {
        red = redShirtSpeeds[i];
      }
      totalSpeed += (red > blue) ? red : blue;
    }
    return totalSpeed;
  }
}

