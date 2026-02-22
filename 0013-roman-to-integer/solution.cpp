class Solution {
public:
    int romanToInt(string s) {
        vector<int> values = {1000, 900, 500, 400, 100, 90, 50,
                              40,   10,  9,   5,   4,   1};
        vector<string> symbols = {"M",  "CM", "D",  "CD", "C",  "XC", "L",
                                  "XL", "X",  "IX", "V",  "IV", "I"};
        int result=0;
        int i=0;
        while(i<s.size()){
            for(int j=0;j<symbols.size();j++){
                if(s.substr(i,symbols[j].size())==symbols[j]){
                    result+=values[j];
                    i+=symbols[j].size();
                    break;
                }
            }
        }
        return result;
    }
};
