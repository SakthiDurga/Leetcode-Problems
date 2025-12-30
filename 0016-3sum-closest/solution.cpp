class Solution {
public:
    int threeSumClosest(vector<int>& nums, int target) {
        int n=nums.size();
        
        sort(nums.begin(),nums.end());
        int initialsum=nums[0]+nums[1]+nums[2];
        for(int i=0;i<n-2;i++){
            int low=i+1;
            int high=n-1;
            while(low<high){
                int closest=nums[i]+nums[low]+nums[high];
                if(abs(target-closest)<abs(target-initialsum)){
                    initialsum=closest;
                }
                if(closest<target) low++;
                else if(closest>target) high--;
                else return closest;
            }
        }
        return initialsum;
    }
};
