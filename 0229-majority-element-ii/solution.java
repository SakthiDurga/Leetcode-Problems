class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        int max = nums.length / 3;
        List<Integer> res = new ArrayList<>();
        for(int key : map.keySet()){
            if(map.get(key) > max){
                res.add(key);
            }
        }
        return res;
    }
}
