package LeetCodeTests;
import java.util.ArrayList;
import java.util.List;

public class StringToInteger {

    public static void main(String[] args) {

        String s = "  ffsdnf -419332 with words ";

        List<Character> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {

            if(s.charAt(i) > 47 && s.charAt(i) <58 ||s.charAt(i) == 45) {
                list.add(s.charAt(i));
            }
        }

        System.out.println(list);

        int[]arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i) - '0';
        }

        int result = 0;
        if(arr[0] == -3){

            for (int i = 1; i < arr.length; i++) {

                result = (int) ((arr[i])*(Math.pow(10,arr.length-i)) + result);

            }
            result = result * -1;

        }else {

            for (int i = 0; i < arr.length; i++) {

                result = (int) ((arr[i])*(Math.pow(10,arr.length-i)) + result);

            }

        }

        System.out.println(result/10);


    }

}
