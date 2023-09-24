package com.tencerspencer.app;

import java.io.Serializable;
import java.util.Set;

public interface IPolygonReducerService extends Serializable {

    public void addShape(Set<Point> points);

}
