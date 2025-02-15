import java.util.Arrays;

public class SolutionTest {

  static String GREEN_COLOR = "\u001B[32m";
  static String RED_COLOR = "\u001B[31m";

  public static void main(String[] args) {
      testCase1();
      testCase2();
      testCase3();
      testCase4();
      testCase5();
      testCase6();
      testCase7();
      testCase8();
      testCase9();
      testCase10();
      testCase11();
      testCase12();
  }

  public static void testCase1() {
      Solution problem = new Solution();
      int[] array = {3, 5, -4, 8, 11, 1, -1, 6};
      int targetSum = 10;
      int[][] expected = {{11, -1}, {-1, 11}};

      int[] actual = problem.twoNumberSum(array, targetSum);
      assertResult("Test Case 1", expected, actual);
  }
  
  public static void testCase2() {
      Solution problem = new Solution();
      int[] array = {4, 6};
      int targetSum = 10;
      int[][] expected = {{4, 6}, {6, 4}};

      int[] actual = problem.twoNumberSum(array, targetSum);
      assertResult("Test Case 2", expected, actual);
  }

  public static void testCase3() {
    Solution problem = new Solution();
    int[] array = {4, 6, 1};
    int targetSum = 5;
    int[][] expected = {{4, 1}, {1, 4}};
  
    int[] actual = problem.twoNumberSum(array, targetSum);
    assertResult("Test Case 3", expected, actual);
  }
  
  public static void testCase4() {
    Solution problem = new Solution();
    int[] array = {4, 6, 1, -3};
    int targetSum = 3;
    int[][] expected = {{6, -3}, {-3, 6}};
  
    int[] actual = problem.twoNumberSum(array, targetSum);
    assertResult("Test Case 4", expected, actual);
  }
  
  public static void testCase5() {
    Solution problem = new Solution();
    int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    int targetSum = 17;
    int[][] expected = {{8, 9}, {9, 8} };

    int[] actual = problem.twoNumberSum(array, targetSum);
    assertResult("Test Case 5", expected, actual);
  }

  public static void testCase6() {
    Solution problem = new Solution();
    int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 15 };
    int targetSum = 18;
    int[][] expected = {{3, 15}, {15, 3} };

    int[] actual = problem.twoNumberSum(array, targetSum);
    assertResult("Test Case 6", expected, actual);
  }

  public static void testCase7() {
    Solution problem = new Solution();
    int[] array = { -7, -5, -3, -1, 0, 1, 3, 5, 7 };
    int targetSum = -5;
    int[][] expected = {{-5, 0}, {0, -5} };

    int[] actual = problem.twoNumberSum(array, targetSum);
    assertResult("Test Case 7", expected, actual);
  }

  public static void testCase8() {
    Solution problem = new Solution();
    int[] array = { -21, 301, 12, 4, 65, 56, 210, 356, 9, -47 };
    int targetSum = 163;
    int[][] expected = {{210, -47}, {-47, 210} };

    int[] actual = problem.twoNumberSum(array, targetSum);
    assertResult("Test Case 8", expected, actual);
  }
  
  public static void testCase9() {
    Solution problem = new Solution();
    int[] array = {-21, 301, 12, 4, 65, 56, 210, 356, 9, -47};
    int targetSum = 164;
    int[][] expected = {};
  
    int[] actual = problem.twoNumberSum(array, targetSum);
    assertResult("Test Case 9", expected, actual);
  }
  
  public static void testCase10() {
    Solution problem = new Solution();
    int[] array = {3, 5, -4, 8, 11, 1, -1, 6};
    int targetSum = 15;
    int[][] expected = {};
  
    int[] actual = problem.twoNumberSum(array, targetSum);
    assertResult("Test Case 10", expected, actual);
  }
  
  public static void testCase11() {
    Solution problem = new Solution();
    int[] array = {14};
    int targetSum = 15;
    int[][] expected = {};
  
    int[] actual = problem.twoNumberSum(array, targetSum);
    assertResult("Test Case 11", expected, actual);
  }
  
  public static void testCase12() {
    Solution problem = new Solution();
    int[] array = {15};
    int targetSum = 15;
    int[][] expected = {};
  
    int[] actual = problem.twoNumberSum(array, targetSum);
    assertResult("Test Case 12", expected, actual);
  }

  // // Helper method to print test results
  private static void assertResult(String testName, int[][] expected, int[] actual) {
      boolean pass = false;
      if (expected.length == 0 && actual.length == 0) {
        pass = true;
      }
      else if (Arrays.equals(expected[0], actual) || Arrays.equals(expected[1], actual)) {
        pass = true;
      } 
      
      if (pass) {
        System.out.printf("\n%s---------- %s ---------- \n\n", GREEN_COLOR, testName);
        return;
      }
      System.out.printf("\n%s---------- %s ---------- \n", RED_COLOR, testName);
      System.out.printf("Expected: %s or %s\n", Arrays.toString(expected[0]), Arrays.toString(expected[1]));
      System.out.printf("Got: %s\n\n", Arrays.toString(actual));
  }

}