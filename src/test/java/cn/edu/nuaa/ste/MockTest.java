package cn.edu.nuaa.ste;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
//Add mock module
public class MockTest {
    // 1.加载Spring的配置文件
    static ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    private void bubbleSortTest(int[] array){
        // 2.取出Bean容器中的实例
        BubbleSortService bubbleSortService = (BubbleSortService) context.getBean("bubbleSortService");
        // 3.调用bean方法
        System.out.println("Before Sort：" + Arrays.toString(array));
        bubbleSortService.sort(array);
        System.out.println("After Bubble Sort：" + Arrays.toString(array));
    }

    private void chooseSortTest(int[] array){
        // 2.取出Bean容器中的实例
        ChooseSortService chooseSortService = (ChooseSortService) context.getBean("chooseSortService");
        // 3.调用bean方法
        System.out.println("Before Sort：" + Arrays.toString(array));
        chooseSortService.sort(array);
        System.out.println("After Choose Sort：" + Arrays.toString(array));
    }

    private void insertSortTest(int[] array){
        // 2.取出Bean容器中的实例
        InsertSortService insertSortService =(InsertSortService) context.getBean("insertSortService");
        // 3.调用bean方法
        System.out.println("Before Sort：" + Arrays.toString(array));
        insertSortService.sort(array);
        System.out.println("After Insert Sort：" + Arrays.toString(array));
    }

    private void quickSortTest(int[] array){
        // 2.取出Bean容器中的实例
        QuickSortService  quickSortService =(QuickSortService) context.getBean("quickSortService");
        // 3.调用bean方法
        System.out.println("Before Sort：" + Arrays.toString(array));
        quickSortService.sort(array,0,array.length-1);
        System.out.println("After Quick Sort：" + Arrays.toString(array));
    }

    private int[] getRealData(){
        DataCollector dataCollector = mock(DataCollector.class);
        int[] array= new int[10];
        for(int i=0;i<10;i++) {
            when(dataCollector.get(i)).thenReturn((int) (Math.random() * 100) );
            array[i]= (int) dataCollector.get(i);
        }
        return array;
    }

    @Test
    public void testInRealData(){
        int[] array = getRealData();
        bubbleSortTest(array);
        array = getRealData();
        chooseSortTest(array);
        array = getRealData();
        insertSortTest(array);
        array = getRealData();
        quickSortTest(array);
    }

}
