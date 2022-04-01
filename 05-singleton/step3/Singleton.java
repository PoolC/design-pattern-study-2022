package step3;

public class Singleton {
    protected static Singleton instance;

    protected Singleton(){}

    // static을 overriding하는게 불가능
    public static Singleton GetInstance(){
        if (instance == null){
            instance = new Singleton();
        }

        return instance;
    }

    public void Do(){
        System.out.println("this is singleton which has type : " + getClass());
    }
}
