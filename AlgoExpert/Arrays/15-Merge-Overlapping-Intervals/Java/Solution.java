import java.util.*;

class Program {

  public int[][] mergeOverlappingIntervals(int[][] intervals) {
    // Write your code here.
    if (intervals.length == 1) {
      return intervals;
    }

    Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

    List<int[]> mergedIntervals = new ArrayList<>();
    mergedIntervals.add(intervals[0]);

    for (int i = 1; i < intervals.length; i++) {
      if (isOverlapping(intervals[i], mergedIntervals)) {
        merge(intervals[i], mergedIntervals);
      } else {
        mergedIntervals.add(intervals[i]);
      }
    }

    return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
  }

  private boolean isOverlapping(int[] interval, List<int[]> mergedIntervals) {
    int endOfPrevInterval = mergedIntervals.get(mergedIntervals.size() - 1)[1];

    if (interval[0] <= endOfPrevInterval) {
      return true;
    }
    return false;
  }

  private void merge(int[] interval, List<int[]> mergedIntervals) {
    int lastItemIdx = mergedIntervals.size() - 1;

    if (mergedIntervals.get(lastItemIdx)[1] < interval[1]) {
      mergedIntervals.get(lastItemIdx)[1] = interval[1];
    }
  }

}
