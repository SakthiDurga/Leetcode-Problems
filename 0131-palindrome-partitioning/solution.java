class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> path = new ArrayList<>();
        formPartition(0, s, res, path);
        return res;
    }
    public void formPartition(int index, String s, List<List<String>> res, List<String> path){
        if(index == s.length()){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i = index; i < s.length(); ++i){
            if(isPalindrome(s, index, i)){
                path.add(s.substring(index, i+1));
                formPartition(i+1, s, res, path);
                path.remove(path.size()-1);
            }
        }
    }
    public boolean isPalindrome(String s, int start, int end){
        while(start <= end)
            if(s.charAt(start++) != s.charAt(end--)) return false;
        return true;
    }
}
