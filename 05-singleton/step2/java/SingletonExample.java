package step2;

import java.lang.reflect.Type;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
Step 2는 Multi Thread 환경에서의 Race Condition을 lock으로 해결하는 예시를 보여줍니다.
 */
public class SingletonExample {
    private static SingletonExample instance;
    public static Lock lock = new ReentrantLock();

    private SingletonExample(){}

    public static SingletonExample GetInstance(){
//        주석처리된 두줄을 주석이 된채로 실행시켜보고 푼채로 실행시켜보면서 비교해 봅시다.
//        lock.lock();
        if (instance == null){
            System.out.println("New called");
            instance = new SingletonExample();
        }
//        lock.unlock();

        return instance;
    }

    public void Do(){
        System.out.println("this is singleton which has hash value : " + hashCode());
    }

    public void Interact(MultiThreadCaller caller){
        System.out.println("Singleton interact with " + caller + " instance.");
    }
}


