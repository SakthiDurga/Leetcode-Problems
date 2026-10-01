class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        formSubsets(nums, 0, res, new ArrayList<>());
        return res;
    }
    public void formSubsets(int[] nums, int index, List<List<Integer>> res, List<Integer> temp){
        if(index == nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[index]);
        formSubsets(nums, index+1, res, temp);
        temp.remove(temp.size()-1);
        formSubsets(nums, index+1, res, temp);
    }
}
