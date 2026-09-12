class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1, right = 0;
        for(int i: piles)
            right = Math.max(i, right);
        while(left < right){
            int mid = left + (right - left) / 2;
            int sum = 0;
            for(int i: piles){
                sum += Math.ceil((double)i/mid);
            }
            if(sum  > h)
                left = mid + 1;
            else
                right = mid;
        }
        return left;
    }
}
