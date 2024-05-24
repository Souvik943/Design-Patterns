package org.patterns.Creational.Singleton;

public class ThreadSafeShape {

    private static ThreadSafeShape instance = null;

    //creating a private constructor
    private ThreadSafeShape() {

    }

    public synchronized static ThreadSafeShape getInstance() {
        if(instance == null) {
            return new ThreadSafeShape();
        }

        return instance;
    }
}
