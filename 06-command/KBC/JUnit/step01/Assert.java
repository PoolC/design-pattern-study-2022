package step01;

public class Assert {
    private Assert() {
        // 인스턴스 생성을 막기 위해 기본생성자를 private로 선언
    }

    public static void assertTrue(boolean condition) {
        if (!condition) {
            throw new AssertionFailedError();
        }

        System.out.println("Test Passed");
    }
}
