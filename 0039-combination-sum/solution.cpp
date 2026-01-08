class Solution {
public:
    vector<vector<int>> combination;
    vector<int> entries;

    void solve(vector<int> &candidates,int target,int index){
        if(target==0){
            combination.push_back(entries);
            return;
        }
        if(target<0)
            return;
        for(int i=index;i<candidates.size();i++){
            entries.push_back(candidates[i]);
            solve(candidates,target-candidates[i],i);
            entries.pop_back();
        }
    }

    vector<vector<int>> combinationSum(vector<int>& candidates, int target) {
        solve(candidates,target,0);
        return combination;
    }
};
