class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int num : nums){
            set.add(num);
        }
        int max_length = 0;
        for(int num : set){
            if(!set.contains(num - 1)){
                int curr_num = num;
                int curr_length = 1;
                while(set.contains(curr_num + 1)){
                    curr_length += 1;
                    curr_num += 1;
                }
                max_length = Math.max(max_length, curr_length);
            }
        }
        return max_length;
    }
}
