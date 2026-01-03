class Solution {
public:
    int searchInsert(vector<int>& nums, int target) {
        int low=0,high=nums.size()-1;
        int n=nums.size();
        int found;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]<target)
                low=mid+1;
            else
                high=mid-1;
        }
        if(nums[0]>target)
            return 0;
        else if(nums[n-1]<target)
            return n;
        else{
            for(int i=0;i<n;i++){
                if(nums[i]<=target && nums[i+1]>=target)
                    found=i+1;
            }
        }
        return found;
    }
};
