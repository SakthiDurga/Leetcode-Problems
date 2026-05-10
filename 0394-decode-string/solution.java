class Solution {
    public String decodeString(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == ']'){
                char c = '\0';
                String sub = "";
                String k = "";
                //substring
                while((c=stack.pop()) != '['){
                    sub = c + sub;
                }
                // repeating times
                while(!stack.empty() && Character.isDigit(stack.peek())){
                    k = stack.pop() + k;
                }
                sub = sub.repeat(Integer.parseInt(k));
                //putting back into stack
                for(int j = 0; j < sub.length(); j++){
                    stack.push(sub.charAt(j));
                }
            } else{
                stack.push(ch);
            }
        }
        StringBuilder result = new StringBuilder();
        while(!stack.empty()){
            result.append(stack.pop());
        }
        return result.reverse().toString();
    }
}
