class Solution {
public:
    bool isMatching(char ch,char c){
        return (ch=='(' && c==')' || ch=='[' && c==']' || ch=='{' && c=='}');
    }
    bool isValid(string str) {
        stack<char> s;
        for(char ch:str){
            if(ch=='(' || ch=='[' || ch=='{'){
                s.push(ch);
            }
            else if(ch==')' || ch==']' || ch=='}'){
                if(s.empty()){
                    return false;
                }
                if(isMatching(s.top(),ch)){
                    s.pop();
                } else{
                    return false;
                }
            }
        }
        return s.empty();
    }
};
