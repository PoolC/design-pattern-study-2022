package step1;

public class Main {
    public static void main(String[] args) {
        SingletonExample.GetInstance().Do();

        Caller caller1 = new Caller();
        Caller caller2 = new Caller();

        SingletonExample.GetInstance().value = 10;

        caller1.Do();
        caller2.Do();

        SingletonExample.GetInstance().value = 200;

        caller1.Do();
        caller2.Do();
    }
}