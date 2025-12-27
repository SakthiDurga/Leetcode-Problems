class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        vector<int> targetArray(2);
        for(int i=0;i<nums.size()-1;i++){
            for(int j=1;j<nums.size();j++){
                if(nums[i]+nums[j]==target && i!=j){
                    targetArray[0]=i;
                    targetArray[1]=j;
                    return targetArray;
                }
            }
        }
        return targetArray;
    }
};
