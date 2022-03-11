import java.util.ArrayList;

public interface ISubject {
    ArrayList<IObserver> Observers = new ArrayList<IObserver>();
    
    public default void Register(IObserver observer){
        Observers.add(observer);
    }
    public default void UnRegister(IObserver observer){
        Observers.remove(observer);
    }
    public default void Notify(){
        for (IObserver observer : Observers){
            observer.Update(getData());
        }
    }
    public Object getData();
    public void setData(Object data);
}
