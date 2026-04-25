class Solution {
public:
    bool isHappy(int n) {
        unordered_set<int> seen;
        while(n!=1 && seen.find(n)==seen.end()){
            seen.insert(n);
            int sum = 0, num = n;
            while(num>0){
                int d = num%10;
                sum += d*d;
                num/= 10;
            }
            n=sum;
        }
        return n==1;
    }
};
