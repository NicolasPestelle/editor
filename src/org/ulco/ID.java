package org.ulco;

public class ID {
    static private int ID = 0;

    private static ID id = new ID();

    private ID(){}

    private static ID getInstance() {
        return id;
    }

    public static int getID() {
        return getInstance().ID++;
    }
}