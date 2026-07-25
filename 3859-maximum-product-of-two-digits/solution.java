class Solution {
    public int maxProduct(int n) {
        List<Integer> list = new ArrayList<>();
        while(n > 0){
            int digit = n%10;
            list.add(digit);
            n /= 10;
        }
        int max = 0, prod;
        for(int i = 0; i < list.size(); i++){
            for(int j = i+1; j < list.size(); j++){
                prod = list.get(i)*list.get(j);
                max = Math.max(max, prod);
            }
        }
        return max;
    }
}
