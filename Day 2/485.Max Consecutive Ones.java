class Solution {
    public int findMaxConsecutiveOnes(int[] nums){
        int cnt=0;
        int m=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                cnt++;
            }
            m=Math.max(m,cnt);
            if(nums[i]==0){

            cnt=0;
            }
        }
        return m;
        
    }
}
