class Solution {
    public int longestConsecutive(int[] nums) {
        Set <Integer> hash=new HashSet<Integer>();
        for(int n:nums){
            hash.add(n);
        }
        int ml=0;
        for(int n:nums){
            if(!hash.contains(n-1))
            {
                int curr=n;
                int l=0;
                while(hash.contains(curr))
                {
                    curr+=1;
                    l+=1;
                }
                ml=Math.max(ml,l);
            }
        }
        return ml;


        
    }
}
