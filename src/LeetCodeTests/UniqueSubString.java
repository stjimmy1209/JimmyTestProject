package LeetCodeTests;


import java.util.HashMap;
import java.util.Map;

public class UniqueSubString {

    public static void main(String[] args) {

        String s = "nissdnjdddlasdfghjkaaeere";
        int n = s.length(); int ans = 0;
        Map<Character,Integer> map = new HashMap<>();

        for (int i = 0,j = 0; j < n; j++) {
            if(map.containsKey(s.charAt(j))){
                i = Math.max(map.get(s.charAt(j)),i);
            }

            ans = Math.max(ans,j - i +1);
            map.put(s.charAt(j), j+1);
        }

        System.out.println(ans);
    }


}
