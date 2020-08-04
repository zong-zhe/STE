package cn.edu.nuaa.ste;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class ChooseSortServiceTest {
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
        ChooseSortService chooseSortService = (ChooseSortService) context.getBean("chooseSortService");
        // 3.调用bean方法
        int[] array = { 11, 27, 23, 156, 19, 4, 56, 59, 9 };
        System.out.println("Before Choose Sort：" + Arrays.toString(array));
        chooseSortService.sort(array);
        System.out.println("After Choose Sort：" + Arrays.toString(array));
    }
}
