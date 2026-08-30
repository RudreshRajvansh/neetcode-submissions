class Solution {
    public String addBinary(String a, String b) {
        int b3;
        int a3;
        StringBuilder s = new StringBuilder();
        int c = 0;
        int j = b.length() - 1, k = a.length() - 1;

        while(k >= 0 || j >= 0 || c != 0) {
           a3 = (k >= 0) ? a.charAt(k--) - '0' : 0;
           b3 = (j >= 0) ? b.charAt(j--) - '0' : 0;

           int sum = a3 + b3 + c;
           s.append(sum % 2);   
           c = sum / 2;       
        }


        return s.reverse().toString();
    }
}
