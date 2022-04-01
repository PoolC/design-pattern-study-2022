package step2;

public class MultiThreadCaller extends Thread{

    @Override
    public void run(){
        SingletonExample.GetInstance().Do();
        SingletonExample.GetInstance().Interact(this);
    }
}
