class Solution {
    public boolean isVowel(char[]arr,int index){
        char ch = arr[index];
        ch = Character.toLowerCase(ch);
        
        // Check if the character is a vowel
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
          return true;
        }
        else{
            return false;
        }
    }

    public static char[] swap (char[]arr, int left , int right ){
        char temp = arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        return arr;
    }

    public String reverseVowels(String s) {
        char[] charArray = s.toCharArray();
        int leftpointer=0;
        int rightPoiner = charArray.length-1;

        while (leftpointer<rightPoiner)
        {
            while(leftpointer<rightPoiner && isVowel(charArray,leftpointer)== false){
               leftpointer++;
            }
            while(leftpointer<rightPoiner && isVowel(charArray,rightPoiner)== false){
                rightPoiner--;
             }
             if (leftpointer < rightPoiner) {
            swap(charArray, leftpointer, rightPoiner);
            leftpointer++;
            rightPoiner--;
        }
        }
        
        return new String(charArray);
    }
}