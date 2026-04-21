class Solution {
    public String multiply(String num1, String num2) {
        int n = num1.length(), m = num2.length();
        int[] arr = new int[n+m];
        for(int i = n-1; i>=0; i--){
            for(int j=m-1; j>=0; j--){
                int dig1 = num1.charAt(i) - '0';
                int dig2 = num2.charAt(j) - '0';
                int product = dig1*dig2;
                int sum = product + arr[i+j+1];
                arr[i+j+1] = sum%10;
                arr[i+j] += sum/10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int num: arr){
            if(!(sb.length() == 0 && num == 0)){
                sb.append(num);
            }
        }
        return (sb.length() == 0 ? "0" : sb.toString());
    }
}
