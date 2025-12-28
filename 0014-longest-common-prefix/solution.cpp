class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        string prefix=strs[0];
        
        for(int i=1;i<strs.size();i++){
            int j;
            for(j=0;j<prefix.size();j++){
                if(prefix[j]==strs[i][j]){
                    continue;
                } else {
                    prefix=prefix.substr(0,j);
                }
            }
        }
        return prefix;
    }
};
