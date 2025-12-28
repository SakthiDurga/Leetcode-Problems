class Solution {
public:
    int maxArea(vector<int>& height) {
        int i=height[0],j=height[height.size()-1];
        int index1=0,index2=height.size()-1;
        int width=height.size()-1;
        int heightt=min(i,j);
        int max=width*heightt;
        while(index1!=index2){
            if(i<=j){
                i=height[++index1];
                width--;
                if(min(i,j)*width>max){
                    max=min(i,j)*width;
                }
            } else{
                j=height[--index2];
                width--;
                if(min(i,j)*width > max){
                    max=min(i,j)*width;
                }
            }
        }
        return max;
    }
};
