import java.util.LinkedList;
import java.util.Queue;

public class URLify {

    // O(n) time complexity
    public static char[] replaceSpaces(char[] inputStr, int actualLenght) {
        Queue<String> queue = buildQueue(inputStr, actualLenght);
        int strIdx = 0;

        while (strIdx < inputStr.length) {
            String currentString = queue.poll();
            char[] charArray = currentString.toCharArray();

            for (char character : charArray) {
                inputStr[strIdx++] = character;
            }
        }

        return inputStr;
    }

    private static Queue<String> buildQueue(char[] inputStr, int actualLenght) {
        Queue<String> queue = new LinkedList<>();
        String currString = "";

        for (int i = 0; i < actualLenght; i++) {
            if (inputStr[i] != ' ') {
                currString += inputStr[i];
            } else if (!currString.isEmpty()) {
                queue.add(currString);
                queue.add("%20");
                currString = "";
            } else {
                queue.add("%20");
            }
        }

        if (!currString.isEmpty()) {
            queue.add(currString);
        }

        return queue;
    }

    public static void main(String[] args) {
        char[] input = "Mr John Smith    ".toCharArray(); // Example input as char[]
        int trueLength = 13; // True length of the string

        String updatedStr = new String(replaceSpaces(input, trueLength));
        System.out.println(updatedStr);
    }

}