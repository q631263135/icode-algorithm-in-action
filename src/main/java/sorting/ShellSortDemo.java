package sorting;

import java.util.Arrays;

/**
 * Created by ycz on 2019/11/6 21:25 21:25.
 */
public class ShellSortDemo {

    public static void main(String[] args) {
        int[] incre_seq = {7, 3, 1};

        int[] a = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};

        for (int seq : incre_seq) {
            // 希尔排序就是把之前的步伐为1迈大一些->seq
            // 相应的每次步伐都要迈开一些->j += seq
            // 那么对于已经走过的数据来说，都是 -> k = j - seq
            for (int j = seq; j < a.length; j += seq) {
                int temp = a[j];

                for (int k = j - seq; k >= 0; k -= seq) {
                    if (temp < a[k]) {
                        a[k + seq] = a[k];
                        a[k] = temp;
                    }
                }

            }
        }

        System.out.println(Arrays.toString(a));

    }
}
