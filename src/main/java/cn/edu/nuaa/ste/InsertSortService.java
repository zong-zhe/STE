package cn.edu.nuaa.ste;

import java.util.Arrays;

public class InsertSortService {
    public void sort(int array[]) {
        int i, j, t = 0;
        for (i = 1; i < array.length; i++) {
            if(array[i]<array[i-1]){
                t = array[i];
                for (j = i - 1; j >= 0 && t < array[j]; j--)
                    array[j + 1] = array[j];
                //插入array[i]
                array[j + 1] = t;
            }
            System.out.println("Insert Sorting：" + Arrays.toString(array));
        }
    }
}
