package ch06.case2;

public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Lamp lamp = new Lamp();

        Command computerOnCommand = new ComputerOnCommand(computer);
        Command lampOnCommand = new LampOnCommand(lamp);
        Controller controller = new Controller();

        controller.setCommand(computerOnCommand);
        controller.call();

        controller.setCommand(lampOnCommand);
        controller.call();
    }
}
