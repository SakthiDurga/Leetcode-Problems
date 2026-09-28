class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombinations(1, k, n, ans, new ArrayList<>());
        return ans;
    }
    public void findCombinations(int index, int k, int n, List<List<Integer>> ans, List<Integer> ds){
        if(k < 0 || n < 0)
            return;
        if(k == 0 && n == 0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i = index; i <= 9; i++){
            ds.add(i);
            findCombinations(i+1, k-1, n-i, ans, ds);
            ds.remove(ds.size()-1);
        }
    }
}
