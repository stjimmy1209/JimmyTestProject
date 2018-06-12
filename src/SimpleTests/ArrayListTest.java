package SimpleTests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTest {

    public static void main(String[] args) {

        Integer[] arr = {12,3,56,43,212,32,1234,16};
        List<Integer> arlst = Arrays.asList(arr);
        System.out.println(arlst +","+"\n");

        int max = arlst.get(0);

        for (int i = 1; i < arlst.size()-1; i++) {

            if(arlst.get(i) > arlst.get(i-1)){

                max = arlst.get(i);

            }

        }

        System.out.println(max);

        System.out.println("\n" + arlst.size());
        System.out.println(arlst.get(4));

    }


}
