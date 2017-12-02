package org.ulco;

abstract public class GraphicsObject {
    public GraphicsObject() {
        m_ID = ID.getID();
    }

    abstract public GraphicsObject copy();

    public int getID() {
        return m_ID;
    }

    abstract boolean isClosed(Point pt, double distance);

    boolean isSimple(){return true;}

    public int size(){return 1;}

    abstract void move(Point delta);

    abstract public String toJson();

    abstract public String toString();

    protected int m_ID;
}
