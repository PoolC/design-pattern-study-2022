package ch06.case2;

public class Controller {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void call() {
        command.run();
    }
}
