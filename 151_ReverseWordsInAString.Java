class Solution {
    public String reverseWords(String s) {
         String str = s.trim().replaceAll("\\s+"," ");
        String[] result = str.split(" ");
        int left = 0;
        int right = result.length - 1;
        while (left<right){
            String temp = result[left];
            result[left] = result[right];
            result[right]= temp;
            left++;
            right--;
        }
        return String.join(" ",result);
    }
}