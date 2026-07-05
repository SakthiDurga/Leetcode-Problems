class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b)->Integer.compare(a[1],b[1]));
        int erase = 0;
        long end = Long.MIN_VALUE;
        for(int[] interval : intervals){
            if(interval[0] < end){
                erase++;
            } else{
                end = interval[1];
            }
        }
        return erase;
    }
}
