package com.tencerspencer.app;

import java.util.List;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;

public final class PolygonReducerUtils {

    private PolygonReducerUtils() {

    }

    public Rectangle2D convertToBoundingBox(List<Point> points) {
        Path2D.Double path = new Path2D.Double();

        Point firstPoint = points.get(0);
        path.moveTo(firstPoint.getX(), firstPoint.getY());

        for (int i = 1; i < points.size(); i++) {
            Point currentPoint = points.get(i);
            path.lineTo(currentPoint.getX(), currentPoint.getY());
        }
        path.closePath();
        return path.getBounds2D();
    }
}


