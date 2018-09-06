package LeetCodeTests;

public class PalindromicSubString {

    public static void main(String[] args) {

        String s = "acbdggdbba";

        PalindromicSubString sample = new PalindromicSubString();
        System.out.println(sample.longestPalindrome(s));
        System.out.println(sample.expandAroundCenter(s, 3,7));

    }


    private int expandAroundCenter(String s, int left, int right){

        int L = left; int R = right;
        while(L>0 && R<s.length() && s.charAt(R) == s.charAt(L)){

            L--;
            R++;

        }
        return R-L-1;

    }

    public String longestPalindrome(String s){

        int start = 0; int end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }


        }
        return s.substring(start, end + 1);
    }

}