class Solution {
public:
    int removeElement(vector<int>& nums, int val) {
        int n=nums.size();
        int low=0;
        int high=n-1;
        while(low<=high){
            if(nums[low]==val){
                swap(nums[low],nums[high]);
                high--;
            } else{
                low++;
            }
        }
        
        return low;
    }
};
