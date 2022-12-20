//Sliding Window Solution optimized
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int max = 0;
        int n = s.length();
        for(int i=0,j=0;i<n;i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                j = Math.max(j,map.get(ch));
            }
            max = Math.max(max,i-j+1);
            map.put(ch,i+1);
        }
        return max;
    }
}
