package step02;

public class Client {
    public static void main(String[] args) {
        Test test = new TestCaseTest("runTest");
        test.run();
        Test test2 = new TestCaseTest("runTestMinus");
        test2.run();
    }
}
