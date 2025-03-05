class Solution {
    public String reverseWords(String s) {
        StringBuilder reversed = new StringBuilder();
        String[] wordsInOriginalString = s.split("\\s+");

        for (int i = wordsInOriginalString.length - 1; i >= 0; i--)
            if (i == 0)
                reversed.append(wordsInOriginalString[i]);
            else if (i == 1 && wordsInOriginalString[0].equals(""))
                reversed.append(wordsInOriginalString[i]);
            else
                reversed.append(wordsInOriginalString[i]).append(" ");

        return reversed.toString();
    }
}