public class Subject<T extends Object> implements ISubject {
    private T data;
    @Override
    public T getData(){
        return data;
    }

    @Override
    public void setData(Object data) {
        try {
            this.data = (T)data;
        } catch (ClassCastException e) {
            System.out.println("Subject Cast failed");
        }
    }
}
