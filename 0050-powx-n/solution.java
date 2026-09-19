class Solution {
    public double myPow(double x, int n) {
        double ans = 1;
        long m = n;
        if (m < 0){
            x = 1.0/x;
            m = -m;
        }
        while(m > 0){
            if(m % 2 == 1){
                ans = ans * x;
                m -= 1;
            } else{
                m /= 2;
                x *= x;
            }
        }
        return ans;
    }
}
