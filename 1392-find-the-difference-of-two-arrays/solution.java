class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> one = new ArrayList<>();
        List<Integer> two = new ArrayList<>();
        
         Set<Integer> set1 = new HashSet<>();
         Set<Integer> set2 = new HashSet<>();
        
        for(int nums : nums2) set2.add(nums);
        for(int nums : nums1) set1.add(nums);

        for(int num: set1){
            if(!set2.contains(num)){
                one.add(num);
            }
        }
        for(int num: set2){
            if(!set1.contains(num)){
                two.add(num);
            }
        }
        res.add(one);
        res.add(two);
        return res;
    }
}
