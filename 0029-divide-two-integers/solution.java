class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;
        double res = dividend/divisor;
        int result = (int) res;
        return result;
    }
}
