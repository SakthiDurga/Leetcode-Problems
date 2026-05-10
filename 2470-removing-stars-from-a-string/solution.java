class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch: s.toCharArray()){
            if(ch == '*' && !stack.empty()){
                stack.pop();
            } else{
                stack.push(ch);
            }
        }
        StringBuilder res = new StringBuilder();
        while(!stack.empty()){
            res.append(stack.peek());
            stack.pop();
        }
        return res.reverse().toString();
    }
}
