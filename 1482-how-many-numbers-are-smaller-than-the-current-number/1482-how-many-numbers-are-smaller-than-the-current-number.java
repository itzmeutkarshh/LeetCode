class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int l = nums.length;
        int count = 0;
        int ans[] = new int[l];
        for(int i=0;i<l;i++){
            for(int j=0;j<l;j++){
                if(nums[i]>nums[j]){
                 count++; 
                 ans[i] = count; 
                } 
                
            }
            count = 0;
            
        }
        return ans;
        
    }
}