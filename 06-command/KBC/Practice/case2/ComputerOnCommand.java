package ch06.case2;

public class ComputerOnCommand implements Command {
    private Computer computer;

    public ComputerOnCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void run() {
        computer.turnOn();
    }
}
