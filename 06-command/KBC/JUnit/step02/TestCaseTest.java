package step02;

/**
 * JUnit 의 구조를 아주 눈꼽만큼만 따라해봅시다.
 *
 * Step 02.
 * 커맨드 패턴을 적용해보자.
 */

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestCaseTest extends TestCase {
    public TestCaseTest(String testCaseName) {
        super(testCaseName);
    }

    public void runTest() {
        long sum = 10 + 10;
        Assert.assertTrue(sum == 20);
    }

    public void runTestMinus() {
        long minus = 100 - 10;
        Assert.assertTrue(minus == 90);
    }

    public static void main(String[] args) {
        new TestCaseTest("runTest").run();
        new TestCaseTest("runTestMinus").run();
    }
}
