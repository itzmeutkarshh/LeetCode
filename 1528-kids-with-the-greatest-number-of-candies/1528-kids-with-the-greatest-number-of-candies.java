class Solution {
        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ls = new ArrayList<Boolean>();
        int l = candies.length;

        int maxV = candies[0];
        for(int i=1;i<l;i++){
            if(candies[i] > maxV){
                maxV = candies[i];
            }
        }    
    
        for(int j=0;j<l;j++){  
            if((extraCandies + candies[j]) >= maxV){
            ls.add(true);
            }
            else ls.add(false);
        }
    return ls;
    }
      
}


