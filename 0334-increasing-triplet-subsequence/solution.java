class Solution {
    public boolean increasingTriplet(int[] nums) {
        if(nums.length < 3) return false;
        int i=Integer.MAX_VALUE, j=Integer.MAX_VALUE;
        for(int c = 0; c < nums.length; c++){
            if(nums[c] <= i) i = nums[c];
            else if(nums[c] <= j) j = nums[c];
            else return true;
        }
        return false;
    }
}
