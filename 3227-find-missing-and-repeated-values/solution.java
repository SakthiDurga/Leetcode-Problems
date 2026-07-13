class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int total = n*n;
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] res = new int[2];
        for(int[] row : grid){
            for(int num : row){
                map.put(num, map.getOrDefault(num,0)+1);
                if(map.get(num) == 2){
                    res[0] = num;
                }
            }
        }
        for(int i = 1; i <= total; i++){
            if(!map.containsKey(i)){
                res[1] = i;
                break;
            }
        }
        return res;
    }
}
