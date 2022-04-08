package ch06.case0;

public class Controller {
    private Computer computer;

    public Controller(Computer computer) {
        this.computer = computer;
    }

    public void call() {
        computer.turnOn();
    }
}
