class Solution {
    public String addBinary(String a, String b) {
        int x = a.length() > b.length() ? a.length() : b.length();
        int b3;
        int a3;
        ArrayList<Character> s = new ArrayList<Character>();
        int c = 0;
        int j = b.length() - 1, k = a.length() - 1;

        for (int i = 0; i < x; i++) {
            try {
                b3 = (b.charAt(j) == '0') ? 0 : 1;
                j--;
            } catch (IndexOutOfBoundsException e) {
                b3 = 0;
            }
            try {
                a3 = (a.charAt(k) == '0') ? 0 : 1;
                k--;
            } catch (IndexOutOfBoundsException e) {
                a3 = 0;
            }

            int r = 0;
            if (a3 + b3 + c == 3) {
                r = 1;
                c = 1;
            } else if (a3 + b3 + c == 2) {
                r = 0;
                c = 1;
            } else {
                r = a3 + b3 + c;
                c = 0; 
            }
            
            s.add(0, (char) (r + '0'));

        }

        if (c == 1) {
            s.add(0, '1');
        }
        
        StringBuilder sb = new StringBuilder();
        for (char ch : s) {
            sb.append(ch);
        }
        
        return sb.toString();
    }
}