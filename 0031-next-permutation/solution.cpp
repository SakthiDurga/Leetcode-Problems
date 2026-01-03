class Solution {
public:
    void nextPermutation(vector<int>& nums) {
        int high=nums.size()-1;
        int last=high;
        while(last>0 && nums[last]<=nums[last-1]){
            last=last-1;
        }
        if(last==0){
            reverse(nums.begin(),nums.end());
            return;
        }

        int breakpoint=last-1;
        for(int i=high;i>breakpoint;i--){
            if(nums[breakpoint]<nums[i]){
                swap(nums[breakpoint],nums[i]);
                break;
            }
        }
        int low=last;
        while(low<high){
            swap(nums[low],nums[high]);
            low++;
            high--;
        }
    }
};
