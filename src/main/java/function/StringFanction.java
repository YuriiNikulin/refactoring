package function;

public class StringFanction extends Fanction<String> {

    String a;
    String b;

    public StringFanction(String a, String b) {
        super(a, b);
    }

    @Override
    public String action_0() {
        return a+b;
    }

    @Override
    public String action_1() {
        return "not implemented";
    }

    @Override
    public String action_2() {
        return "not implemented";
    }

    @Override
    public String action_3() {
        return "not implemented";
    }
}
