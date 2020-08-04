package cn.edu.nuaa.ste;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;


public class BubbleSortServiceTest {
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
        BubbleSortService bubbleSortService = (BubbleSortService) context.getBean("bubbleSortService");
        // 3.调用bean方法
        int[] array = { 37, 47, 23, 100, 19, 56, 56, 99, 9 };
        System.out.println("Before Bubble Sort：" + Arrays.toString(array));
        bubbleSortService.sort(array);
        System.out.println("After Bubble Sort：" + Arrays.toString(array));
    }
}
