class Solution {
    public int maximumCount(int[] nums) {
        int n=nums.length;
         int t=0;
         int m=0;
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                t++;
            }
            else if(nums[i]==0){
                m++;
            }
            else{
        break;
            }
        }
     return Math.max(t,n-t-m);
    }
}