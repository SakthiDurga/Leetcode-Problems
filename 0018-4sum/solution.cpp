class Solution {
public:
    vector<vector<int>> fourSum(vector<int>& nums, int target) {
        vector<int> entry;
        vector<vector<int>> result;
        sort(nums.begin(),nums.end());
        int n=nums.size();
        for(int i=0;i<n-3;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            for(int j=i+1;j<n-2;j++){
                if(j>i+1 && nums[j]==nums[j-1] && j!=i){
                    continue;
                }
                int low=j+1;
                int high=n-1;
                while(low<high){
                    long long sum=(long long)nums[i]+nums[j]+nums[low]+nums[high];
                    if(sum==target){
                        entry={nums[i],nums[j],nums[low],nums[high]};
                        result.push_back(entry);
                        while(low<high && nums[low]==nums[low+1]){
                            low++;
                        }
                        while(low<high && nums[high]==nums[high-1]){
                            high--;
                        }
                        low++;
                        high--;
                    }
                    else if(sum<target){
                        low++;
                    } else{
                        high--;
                    }
                }
            }
        }
        return result;
    }
};
