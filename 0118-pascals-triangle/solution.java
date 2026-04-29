class Solution {
    public List<List<Integer>> generate(int numRows) {
         List<List<Integer>> triangle = new ArrayList<>();
         if(numRows == 0) return triangle;
         List<Integer> first_row = new ArrayList<>();
         first_row.add(1);
         triangle.add(first_row);
         for(int i = 1; i < numRows; i++){
            List<Integer> prev = triangle.get(i-1);
            List<Integer> current = new ArrayList<>();
            current.add(1);
            for(int j = 1; j < i; j++){
                current.add(prev.get(j-1) + prev.get(j));
            }
            current.add(1);
            triangle.add(current);
         }
         return triangle;
    }
}
