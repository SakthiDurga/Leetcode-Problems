class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0;
        for(int i = 0; i < nums.length; i++){
            total += nums[i];
        }
        int leftsum = 0;
        for(int i = 0; i < nums.length; i++){
            if(i!=0) leftsum+=nums[i-1];
            if(total-leftsum-nums[i] == leftsum) return i;
        }
        return -1;
    }
}
