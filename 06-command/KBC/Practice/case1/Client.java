package ch06.case1;

public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Lamp lamp = new Lamp();

        Controller controller = new Controller(computer, lamp);

        controller.call();
        controller.setMode(Mode.COMPUTER);
        controller.call();
        controller.setMode(Mode.LAMP);
        controller.call();
    }
}

