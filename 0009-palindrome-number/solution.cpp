class Solution {
public:
    bool isPalindrome(int x) {
        if(x<0) return false;
        long reverse=0;
        int num=x;
        while(num>0){
            int digit=num%10;
            reverse=reverse*10 + digit;
            num/=10;
        }
        if (reverse==x){
            return true;
        } else{
            return false;
        }
    }
};
