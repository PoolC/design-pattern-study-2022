package ch06.case0;

public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Controller controller = new Controller(computer);

        controller.call();
    }
}
