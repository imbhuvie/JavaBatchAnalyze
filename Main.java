public class Main {
    public static void main(String[] args) {
        String s = "zaz";
        Solution sol = new Solution();
        int ans = sol.scoreOfString(s);
        System.out.println(ans);
    }
}

class Solution {
    public int scoreOfString(String s) {
        int ans = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            int sum = s.charAt(i) - s.charAt(i + 1);
            if (sum < 0) {
                sum = -sum;
            }
            ans += sum;
        }
        return ans;
    }
}