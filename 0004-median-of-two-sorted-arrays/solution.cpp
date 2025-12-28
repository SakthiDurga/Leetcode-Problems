class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        int index1=0,index2=0;
        bool end1=(nums1.size()==0),end2=(nums2.size()==0);
        vector<int> merged;
        while(!(end1 && end2)){
            if(end1){
                merged.push_back(nums2[index2]);
                index2++;
                end2=(index2==nums2.size());
            } else if(end2){
                merged.push_back(nums1[index1]);
                index1++;
                end1=(index1==nums1.size());
            } else if(nums1[index1]<=nums2[index2]){
                merged.push_back(nums1[index1]);
                index1++;
                end1=(index1==nums1.size());
            } else if(nums2[index2]<nums1[index1]){
                merged.push_back(nums2[index2]);
                index2++;
                end2=(index2==nums2.size());
            } 
        }
        int s=merged.size();
        if(s%2==0){
            return double(merged[s/2]+merged[s/2 -1])/2.0;
        } else{
            return double(merged[s/2]);
        }
    }
};
