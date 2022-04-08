package ch06.case1;

public class Controller {
    private Computer computer;
    private Lamp lamp;
    private Mode mode;

    public Controller(Computer computer, Lamp lamp) {
        this.computer = computer;
        this.lamp = lamp;
        this.mode = Mode.NONE;
    }

    public void setMode(Mode mode) {
        this.mode = mode;
    }

    public void call() {
        switch (this.mode) {
            case NONE:
                System.out.println("현재 설정된 모드가 없습니다.");
                break;
            case COMPUTER:
                this.computer.turnOn();
                break;
            case LAMP:
                this.lamp.turnOn();
                break;
        }
    }
}