package org.patterns.Creational.Singleton;

public class Shape {

    private static Shape instance = null;
    //creating a private constructor , so that people are not able to create numerous objects
    private Shape() {

    }

    //creating a getinstance method so that if we want to create any object we have to call this to create an object , rather than creatingan object directly
    public static Shape getInstance() {
        if(instance == null) {
            return new Shape();
        }
        return instance;
    }

}
