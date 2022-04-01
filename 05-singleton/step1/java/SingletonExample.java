package step1;

/*
Step 1은 기본적인 Singleton 패턴에 대해 다룹니다.
 */
public class SingletonExample {
    private static SingletonExample instance;

    private SingletonExample(){}

    // 책에 나온 Lazy Initialization을 이용
    public static SingletonExample GetInstance()
    {
        if (instance == null){
            instance = new SingletonExample();
        }

        return instance;
    }

    public float value;

    public void Do(){
        System.out.println("this is singleton which has value : " + value);
    }
}


