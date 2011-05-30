package com.codejuice.amoeba.entity;

import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.StrokeType;

public class Cell {

    public final Circle body;

    public Cell() {
        body = new Circle(5);
        body.setStrokeType(StrokeType.OUTSIDE);
        body.setStroke(Color.web("white", 0.2f));
        body.setStrokeWidth(4f);
    }
}
