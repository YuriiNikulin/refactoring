package function;

public class IntegerFanction extends Fanction<Integer> {

    int a;
    int b;

    public IntegerFanction(Integer a, Integer b) {
        super(a, b);
    }

    @Override
    public Integer action_0() {
        return a+b;
    }

    @Override
    public Integer action_1() {
        return a-b;
    }

    @Override
    public Integer action_2() {
        return a*b;
    }

    @Override
    public Integer action_3() {
        return a/b;
    }
}
