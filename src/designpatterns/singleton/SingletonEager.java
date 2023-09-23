package designpatterns.singleton;

/**
 * A singleton design pattern that instance itself without
 * checking first, see SingletonLazy.java
 */
public class SingletonEager {
    private static SingletonEager instance = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstance() {
        return instance;
    }
}
