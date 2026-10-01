class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();
        formSubsets(nums, 0, res, new ArrayList<>());
        return new ArrayList<>(res);
    }

    public void formSubsets(int[] nums, int index, Set<List<Integer>> res, List<Integer> temp) {
        if (index == nums.length) {
            List<Integer> subset = new ArrayList<>(temp);
            Collections.sort(subset);
            res.add(subset);
            return;
        }
        temp.add(nums[index]);
        formSubsets(nums, index + 1, res, temp);
        temp.remove(temp.size() - 1);
        formSubsets(nums, index + 1, res, temp);
    }
}
