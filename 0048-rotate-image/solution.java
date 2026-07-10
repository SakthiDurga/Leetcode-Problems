class Solution {
    public void rotate(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;
        for(int i = 0; i < row; i++){
            for(int j = i; j < column; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i = 0; i < row; i++){
            int left = 0, right = column-1;
            while(left < right){
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }
}
