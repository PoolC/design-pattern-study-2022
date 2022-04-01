package step01;

/**
 * JUnit 의 구조를 아주 눈꼽만큼만 따라해봅시다.
 *
 * Step 01.
 * 일단 뭐라도 만들자 (커멘드 패턴 적용 X)
 *
 * Assert.assertTrue 라는 static method를 만들고, 이 메서드를 활용하여 테스트를 돌립니다.
 *
 * Assert.java는 구조상 인스턴스로 생성되는 것을 막는 것이 좋기 때문에, private로 생성자를 지정합니다.
 *
 * <해당 구조의 단점>
 * - 확장을 염두에 두고 코드를 작성하지 않았으므로, 매번마다 새롭게 코드를 짜야한다.
 */

public class TestCaseTest {
    public static void main(String[] args) {
        new TestCaseTest().runTest();
    }

    public void runTest() {
        long num = 10 + 10;
        Assert.assertTrue(num == 20);
    }
}
