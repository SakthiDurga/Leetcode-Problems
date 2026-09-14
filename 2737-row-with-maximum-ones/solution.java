class Solution {
    public int lowerBound(int[] arr, int target){
        int left = 0, right = arr.length - 1;
        int ans = arr.length;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(arr[mid] == target){
                ans = mid;
                right = mid - 1;
            } else if(arr[mid] < target){
                left = mid + 1;
            } else{
                right = mid - 1;
            }
        }
        return ans;
    }
    public int[] rowAndMaximumOnes(int[][] mat) {
        int n = mat.length, m = mat[0].length;
        int index = 0, count = 0;
        for(int i = 0; i < n; i++){
            Arrays.sort(mat[i]);
            int countOnes = m - lowerBound(mat[i], 1);
            if(countOnes > count){
                count = countOnes;
                index = i;
            }
        }
        return new int[]{index, count};
    }
}
