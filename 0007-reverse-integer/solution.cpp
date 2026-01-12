class Solution {
public:
    int reverse(int x) {
        long num = x;
        long reverse = 0;
        if (num < 0) {
            num = num - (2 * num);
            while (num > 0) {
                int digit = num % 10;
                reverse = reverse * 10 + digit;
                num /= 10;
            }
            reverse = -reverse;
            if(reverse<INT_MIN) return 0;
            return reverse;
        } else {
            while (num > 0) {
                int digit = num % 10;
                reverse = reverse * 10 + digit;
                num /= 10;
            }
            if(reverse>INT_MAX) return 0;
            return reverse;
        }
    }
};
