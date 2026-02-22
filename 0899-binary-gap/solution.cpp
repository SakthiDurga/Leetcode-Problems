class Solution {
public:
    int binaryGap(int n) {
        if(n==0) return 0;
        string binary;
        while(n>0){
            binary=to_string(n%2)+binary;
            n/=2;
        }
        int prev=-1,maxGap=0;
        for(int i=0;i<binary.size();i++){
            if(binary[i]=='1'){
                if(prev!=-1){
                    maxGap=max(maxGap,i-prev);
                }
                prev=i;
            }
        }
        return maxGap;
    }
};
