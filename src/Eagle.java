public class Eagle<T> implements Bird<T>{
    @Override
    public void display(T t) {
        System.out.println("Eagle");
    }
}
