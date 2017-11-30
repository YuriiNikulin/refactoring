package function;

public abstract class Fanction<T> {

    private T a;
    private T b;

    public Fanction(T a, T b) {
        this.a = a;
        this.b = b;
    }

    public abstract T action_0();

    public abstract T action_1();

    public abstract T action_2();

    public abstract T action_3();

}
