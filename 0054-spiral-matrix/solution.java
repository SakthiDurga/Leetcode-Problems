class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int colStart = 0;
        int rowStart = 0;
        int rowEnd = matrix.length - 1;
        int colEnd = matrix[0].length - 1;

        while(colStart <= colEnd && rowStart <= rowEnd){
            for(int i = colStart; i <= colEnd; i++)
                ans.add(matrix[rowStart][i]);
            rowStart++;
            for(int i = rowStart; i <= rowEnd; i++)
                ans.add(matrix[i][colEnd]);
            colEnd--;
            if(rowStart <= rowEnd){
                for(int i = colEnd; i >= colStart; i--)
                    ans.add(matrix[rowEnd][i]);
                rowEnd--;
            }
            if(colStart <= colEnd){
                for(int i = rowEnd; i >= rowStart; i--)
                    ans.add(matrix[i][colStart]);
                colStart++;
            }

        }
        return ans;
        
    }
}
