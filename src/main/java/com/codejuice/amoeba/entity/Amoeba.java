package com.codejuice.amoeba.entity;


import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.StrokeType;

public class Amoeba {

    public final Circle body;

    public Amoeba(float x, float y) {
        body = new Circle(20, Color.web("white", 0.05f));

        body.setStrokeType(StrokeType.OUTSIDE);
        body.setStroke(Color.web("white", 0.2f));
        body.setStrokeWidth(4f);

        body.setCenterX(x);
        body.setCenterY(y);

    }

}

enum Size {
    SMALL, MEDIUM, LARGE;
}
