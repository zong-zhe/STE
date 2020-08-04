package cn.edu.nuaa.ste;

import java.util.Arrays;

public class QuickSortService {
    public void sort(int array[], int low, int high) {// 传入low=0，high=array.length-1;
        int pivot, p_pos, i, t;// pivot->位索引;p_pos->轴值。
        if (low < high) {
            p_pos = low;
            pivot = array[p_pos];
            for (i = low + 1; i <= high; i++)
                if (array[i] > pivot) {
                    p_pos++;
                    t = array[p_pos];
                    array[p_pos] = array[i];
                    array[i] = t;
                }
            t = array[low];
            array[low] = array[p_pos];
            array[p_pos] = t;
            System.out.println("Quick Sorting：" + Arrays.toString(array));
            // 分而治之
            sort(array, low, p_pos - 1);// 排序左半部分
            sort(array, p_pos + 1, high);// 排序右半部分
        }

    }
}
