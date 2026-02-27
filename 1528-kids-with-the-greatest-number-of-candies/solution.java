class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = max(candies);
        List<Boolean> result = new ArrayList<>();
        for(int i=0; i<candies.length; i++){
            result.add((candies[i] + extraCandies) >= maxCandies);
        }
        return result;
    }
    private int max(int[] a){
        int max = a[0];
        for(int i=0;i<a.length;i++){
            if( a[i] > max){
                max = a[i];
            }
        }
        return max;
    }
}
