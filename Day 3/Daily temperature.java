class Solution {
    public int[] dailyTemperatures(int[] T) {
        
        int n = T.length;
        int[] rst = new int[n];
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++) //find the first hot day
            {
                if(T[j]>T[i])
                {
                    rst[i] =j-i;
                    break;
                }
            }
        }
        return rst;
    }
        
}
