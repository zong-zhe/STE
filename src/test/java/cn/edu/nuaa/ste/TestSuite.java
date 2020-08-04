package cn.edu.nuaa.ste;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        BubbleSortServiceTest.class,
        ChooseSortServiceTest.class,
        InsertSortServiceTest.class,
        QuickSortServiceTest.class
})

public class TestSuite {
}
