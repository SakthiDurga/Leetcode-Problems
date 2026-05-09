class Solution {
    public int equalPairs(int[][] grid) {
        HashMap<String, Integer> freqmap = new HashMap<>();
        int pairs = 0;
        for(int [] rows : grid){
            freqmap.merge(Arrays.toString(rows), 1, Integer::sum);
        }
        for(int i = 0; i < grid[0].length; i++){
            int [] cols = new int[grid.length];
            for(int j = 0; j < grid.length; j++){
                cols[j] = grid[j][i];
            }
            pairs += freqmap.getOrDefault(Arrays.toString(cols), 0);
        }
        return pairs;
    }
}
