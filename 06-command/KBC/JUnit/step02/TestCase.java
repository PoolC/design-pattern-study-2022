package step02;

import java.lang.reflect.Method;

public abstract class TestCase implements Test {
    protected String testCaseName;

    public TestCase(String testCaseName) {
        this.testCaseName = testCaseName;
    }

    public void run() {
        try {
            // 테스트 케이스 구별을 위해 name 출력
            System.out.println(testCaseName);
            Method method = this.getClass().getMethod(testCaseName, null);
            method.invoke(this, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
