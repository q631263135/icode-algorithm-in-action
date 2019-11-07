package sorting;

import java.util.Arrays;

/**
 * Created by ycz on 2019/11/7 20:32.
 */

/*
Given an array of N items and L = 0, Selection Sort will:
Find the position X of the smallest item in the range of [L...N−1],
Swap X-th item with the L-th item,
Increase the lower-bound L by 1 and repeat Step 1 until L = N-2.
Without further ado, let's try Selection Sort on the same small example array [29, 10, 14, 37, 13].

Without loss of generality, we can also implement Selection Sort in reverse:
Find the position of the largest item Y and swap it with the last item.
 */
public class SelectionSortDemo {

    public static void main(String[] args) {
        int[] a = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};


        for (int i = 0; i < a.length; i++) {

            int min_pos = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[min_pos] > a[j]) {
                    min_pos = j;
                }
            }

            int temp = a[i];
            a[i] = a[min_pos];
            a[min_pos] = temp;
        }

        System.out.println(Arrays.toString(a));
    }


    public int[] sort(int[] sourceArray) throws Exception {
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);

        // 总共要经过 N-1 轮比较
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;

            // 每轮需要比较的次数 N-i
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    // 记录目前能找到的最小值元素的下标
                    min = j;
                }
            }

            // 将找到的最小值和i位置所在的值进行交换
            if (i != min) {
                int tmp = arr[i];
                arr[i] = arr[min];
                arr[min] = tmp;
            }

        }
        return arr;
    }
}
