public class Observer<T extends Object> implements IObserver{
    @Override
    public void Update(Object data){
        try {
            T t = (T)data;
        } catch (ClassCastException e) {
            System.out.println("Object cast failed");
        }
    }
}
