package cn.edu.nuaa.ste;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class QuickSortServiceTest {
    @Test
    public void testSort() throws Exception {
        /**
         * 1.加载Spring的配置文件
         * 2.取出Bean容器中的实例
         * 3.调用bean方法
         */
        // 1.加载Spring的配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        // 2.取出Bean容器中的实例
        QuickSortService quickSortService = (QuickSortService) context.getBean("quickSortService");
        // 3.调用bean方法
        int[] array = { 57, 27, 13, 0, 9, 6, 6, 6, -1 };
        System.out.println("Before Quick Sort：" + Arrays.toString(array));
        quickSortService.sort(array,0,array.length-1);
        System.out.println("After Quick Sort：" + Arrays.toString(array));
    }
}
