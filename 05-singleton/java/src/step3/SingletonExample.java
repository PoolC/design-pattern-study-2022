package step3;

import java.lang.reflect.Type;

/*
Step 3은 Singleton 패턴의 DIP원칙의 위배에 대해 다룹니다.
문제가 있는 상황을 다루기 때문에 실제로 실행하기 위한 파일은 아닙니다.
이미 코드상 에러가 잔뜩있음
 */
public class SingletonExample extends Singleton {
    private SingletonExample(){}

//    public static SingletonExample GetInstance(){
//         ?? 이렇게 가야하나..?
//        if (Singleton.GetInstance() instanceof SingletonExample temp){
//            return temp;
//        } else {
//            return null;
//        }

//        여러모로 모르겠
//        if (instance == null){
//            instance = new SingletonExample();
//        }
//
//        if (instance instanceof  SingletonExample temp){
//            return temp;
//        } else{
//            return null;
//        }
//    }

    public void Do(){
        System.out.println("this is singleton which has type : " + getClass());
    }
}


