package sorting;

import java.util.Arrays;

/**
 *
 * 插入排序demo
 * <br/>
 *
 * @author yangchaozheng
 * @date 2019/10/31 19:48
 */
public class InsertionSortDemo {

  /*  mark first element as sorted

for each unsorted element X

  'extract' the element X

  for j = lastSortedIndex down to 0

    if current element j > X

      move sorted element to the right by 1

    break loop and insert X here*/


    public static void insertionSort(int[] a) {

        for (int i = 1; i < a.length; i++) {
            for (int j = i; j >= 1; j--) {
                int temp;
                if (a[j] < a[j - 1]) {
                    temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                }
            }
        }

    }


    public static void insertionSortPlus(int[] a) {

        for (int i = 1; i < a.length; i++) {
            int temp = a[i];

            for (int j = i - 1; j >= 0; j--) {
                if (temp < a[j]) {
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }
        }

    }


    public static void main(String[] args) throws Exception {
        int[] a = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        insertionSort(a);
        System.out.println(Arrays.toString(a));

        int[] a1 = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        insertionSortPlus(a1);
        System.out.println(Arrays.toString(a1));

        int[] a2 = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        int[] sort = sort(a2);
        System.out.println(Arrays.toString(sort));
    }

    // 菜鸟教程上的；另参见：https://visualgo.net/en/sorting
    public static int[] sort(int[] sourceArray) throws Exception {
        // 对 arr 进行拷贝，不改变参数内容
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);

        // 从下标为1的元素开始选择合适的位置插入，因为下标为0的只有一个元素，默认是有序的
        for (int i = 1; i < arr.length; i++) {

            // 记录要插入的数据
            int tmp = arr[i];

            // 从已经排序的序列最右边的开始比较，找到比其小的数
            int j = i;
            while (j > 0 && tmp < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }

            // 存在比其小的数，插入
            if (j != i) {
                arr[j] = tmp;
            }

        }
        return arr;
    }
}
