package designpatterns.singleton;

/**
 * A thread-safe variation of SingletonLazy.
 * @see <a href="https://stackoverflow.com/a/24018148">Reference</a>
 */

public class SingletonLazyHolder {

    private static class InstanceHolder {
        public static SingletonLazyHolder instance = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstance() {
        return InstanceHolder.instance;
    }
}
