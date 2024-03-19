package ch15.lecture.p1list;

import java.util.ArrayList;
import java.util.List;

public class C04NestedList {
    public static void main(String[] args) {
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };

        System.out.println(array[1][1]);
        System.out.println(array[2][2]);
        System.out.println(array[1][0]);

        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            List<Integer> sublist = new ArrayList<>();
            for (int k = 0; k < array[i].length; k++) {
                sublist.add(array[i][k]);
            }
            list.add(sublist);
        }


        System.out.println(list.get(1).get(1)); // 92
        System.out.println(list.get(2).get(2)); // 93
        System.out.println(list.get(1).get(0)); // 83
    }
}
