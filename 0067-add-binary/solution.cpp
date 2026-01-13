class Solution {
public:
    string addBinary(string a, string b) {
        string result="";
        int carry=0;
        int lenA = a.size();
        int lenB = b.size();
        if(lenA<lenB)
            a.insert(0,lenB-lenA,'0');
        else if(lenB<lenA)
            b.insert(0,lenA-lenB,'0');

        for(int i=a.size()-1;i>=0;i--){
            int bitA = a[i]-'0';
            int bitB = b[i]-'0';
            int sum=bitA + bitB + carry;
            result.push_back((sum%2)+'0');
            carry=sum/2;
        }
        if(carry) result.push_back('1');
        reverse(result.begin(),result.end());
        return result;
    }
};
