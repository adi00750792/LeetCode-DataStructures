import java.util.ArrayList;
import java.util.List;

class Solution {

    public static int maxCandies(int[]candies){
       int max = Integer.MIN_VALUE;
       for(int i =0;i<candies.length;i++){
          if(candies[i]>max){
            max=candies[i];
          }
          
       }
       return max;
       }
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> resultList = new ArrayList<>();
        int maxCandiesWithStudentsAlready=maxCandies(candies);
        for(int candy : candies){
             resultList.add(candy+extraCandies>=maxCandiesWithStudentsAlready);
        }
        return resultList;
    }
    
}