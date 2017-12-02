package org.ulco;

public class Utilitaire {
    //layers
    public static GraphicsObjects select(Point pt, double distance, Layer layer) {
        GraphicsObjects list = new GraphicsObjects();
        for (GraphicsObject object : layer.getM_list()) {
            if (object.isClosed(pt, distance)) {
                list.add(object);
            }
        }
        return list;
    }

    //document
    public static GraphicsObjects select(Point pt, double distance, Document doc) {
        GraphicsObjects list = new GraphicsObjects();

        for (Layer layer : doc.getM_layers()) {
            list.addAll(select(pt, distance, layer));
        }
        return list;
    }
}
