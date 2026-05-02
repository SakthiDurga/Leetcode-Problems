class Solution {
    public int longestSubarray(int[] nums) {
        int left=0,max=0,z=0;
        for(int right = 0; right < nums.length; right++){
            if(nums[right]==0) z++;
            if(z>1){
                while(nums[left] == 1) left++;
                left++;
                z--;
            }
            max = Math.max(max,right-left);
        }
        return max;
    }
}
