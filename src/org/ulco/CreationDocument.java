package org.ulco;

public class CreationDocument {




    public static void DocumentGrille(Document doc, Point origin, int line, int column, double length) {


        Layer lay = doc.createLayer();

        for (int indexX = 0; indexX < column; ++indexX) {
            for (int indexY = 0; indexY < line; ++indexY) {
                lay.add(new Square(new Point(origin.getX() + indexX * length, origin.getY() + indexY * length), length));
            }
        }
    }

    public static void DocumentCercle(Document doc, Point center, int number, double radius, double delta) {


        Layer lay = doc.createLayer();

        for (int index = 0; index < number; ++index) {
            lay.add(new Circle(center, radius + index * delta));
        }
    }
}
