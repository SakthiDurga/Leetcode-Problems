class Solution {
    public int largestAltitude(int[] gain) {
        int[] altitudes = new int[gain.length+1];
        altitudes[0] = 0;
        int sum = 0;
        for(int i = 1; i <= gain.length; i++){
            sum += gain[i-1];
            altitudes[i] = sum;
        }
        return Arrays.stream(altitudes).max().orElseThrow();
    }
}
