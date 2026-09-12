class Solution {
    public boolean possible(int[] bloomDay, int day, int m, int k){
        int adj = 0, curr = 0;
        for(int i = 0; i < bloomDay.length; i++){
            if(bloomDay[i] <= day){
                adj++;
            } else{
                curr += (int) adj/k;
                adj = 0;
            }
        }
        curr += (int) adj/k;
        if(curr >= m) return true;
        return false;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        if(bloomDay.length < (long)m*k) return -1;
        int low = Integer.MAX_VALUE, high = Integer.MIN_VALUE;
        for(int i: bloomDay){
            low = Math.min(i,low);
            high = Math.max(i,high);
        }
        while(low < high){
            int mid = low + (high - low) / 2;
            if(possible(bloomDay, mid, m, k)){
                high = mid;
            } else{
                low = mid + 1;
            }
        }
        return low;
    }
}
