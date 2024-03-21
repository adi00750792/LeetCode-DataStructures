class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder alternatelyMergedString = new StringBuilder();
        int i = 0;
        while (i < word1.length() && i < word2.length()) {
            alternatelyMergedString.append(word1.charAt(i)).append(word2.charAt(i));
            i++;
        }
        alternatelyMergedString.append(word1.substring(i)).append(word2.substring(i));
        return alternatelyMergedString.toString();

    }
}