package in.gagan.design.pattern.creational;

import java.io.Serializable;

public final class Singleton implements Cloneable, Serializable {

    private Singleton() { }

    public static Singleton getInstance(){
        return SingletonHelper.INSTANCE;
    }

    private static class SingletonHelper {
        private static final Singleton INSTANCE = new Singleton();
    }

    protected Object readResolve() {
        return SingletonHelper.INSTANCE;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

}
