class Solution {
    public String addBinary(String a, String b) {
        int b3;
        int a3;
        int maxLen = Math.max(a.length(), b.length());
        StringBuilder s = new StringBuilder(maxLen + 1);
        int c = 0;
        int j = b.length() - 1, i = a.length() - 1;

        while (i >= 0 || j >= 0 || c > 0) {
        int sum = c;
        if (i >= 0) sum += a.charAt(i--) - '0';
        if (j >= 0) sum += b.charAt(j--) - '0';
        s.append(sum % 2);
        c = sum / 2;
        }


        return s.reverse().toString();
    }
}
