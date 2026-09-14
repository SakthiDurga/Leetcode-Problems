class Solution {
    public boolean possible(int[] nums, int sum, int k){
        int count = 1, total = 0;
        for(int i: nums){
            total += i;
            if(total > sum){
                total = i;
                count++;
            }
            if(count > k) return false;
        }
        return true;
    }
    public int splitArray(int[] nums, int k) {
        int left = 0, right = 0;
        for(int i: nums){
            left = Math.max(i, left);
            right += i;
        }
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(possible(nums, mid, k))
                right = mid - 1;
            else
                left = mid + 1;
        }
        return left;
    }
}
