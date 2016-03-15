package Lab2_14_1;

/**
 * Created by Alex on 14.03.2016.
 */
public class MyTup <A,B,C> {
    private A a;
    private B b;
    private C c;

    public MyTup(A a, B b, C c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public A getA() {
        return a;
    }

    public B getB() {
        return b;
    }

    public C getC() {
        return c;
    }
}
