package cn.edu.nuaa.ste;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class InsertSortServiceTest {
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
        InsertSortService insertSortService = (InsertSortService) context.getBean("insertSortService");
        // 3.调用bean方法
        int[] array = { 7, 44, 2, 10, 9, 56, 563, 929, 19 };
        System.out.println("Before Insert Sort：" + Arrays.toString(array));
        insertSortService.sort(array);
        System.out.println("After Insert Sort：" + Arrays.toString(array));
    }
}
