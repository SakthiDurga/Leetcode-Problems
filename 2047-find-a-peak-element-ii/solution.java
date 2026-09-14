class Solution {
    public int findMaxRow(int[][] mat, int col, int row){
        int index = -1, max = Integer.MIN_VALUE;
        for(int i = 0;i < row; i++){
            if(mat[i][col] > max){
                max = mat[i][col];
                index = i;
            }
        }
        return index;
    }
    public int[] findPeakGrid(int[][] mat) {
        int row = mat.length, col = mat[0].length;
        int low = 0, high = col-1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            int maxRow = findMaxRow(mat, mid, row);
            int left = mid - 1 >= 0 ? mat[maxRow][mid - 1] : -1;
            int right = mid + 1 < col ? mat[maxRow][mid + 1] : -1;
            int num = mat[maxRow][mid];
            if(num > left && num > right)
                return new int[]{maxRow, mid};
            else if(num < left) high = mid - 1;
            else low = mid + 1;
        }
        return new int[]{-1, -1};
    }
}
