package com.codejuice.amoeba.entity;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.effect.BlendMode;
import javafx.scene.effect.BoxBlur;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.StrokeType;
import javafx.scene.text.Text;

public class Amoeba {

    public final Group _body;
    public final Circle body;

    public final ObservableList<Cell> cells;

    private static final Color AMOEBA_COLOR = Color.web("white", 0.7);
    private static final Color AMOEBA_SELECTED_COLOR = Color.web("blue", 0.7);

    public Amoeba(float x, float y, int cells) {

        _body = new Group();

        this.cells = FXCollections.observableArrayList();

        for (int i = 0; i < cells; i++) {
            this.cells.add(new Cell(0, 0));
        }

        body = new Circle(20, Color.web("white", 0.05f));

        body.setStrokeType(StrokeType.OUTSIDE);
        body.setStroke(AMOEBA_COLOR);
        body.setStrokeWidth(4f);

        body.setCenterX(x);
        body.setCenterY(y);

        body.setEffect(new BoxBlur(7, 7, 3));

        body.addEventHandler(MouseEvent.MOUSE_ENTERED, mouseEntered);
        body.addEventHandler(MouseEvent.MOUSE_EXITED, mouseExited);

        Text text = new Text(String.valueOf(cells));
        text.setStroke(Color.web("white", 0.05f));
        text.setLayoutX(x);
        text.setLayoutY(y);


        _body.getChildren().add(body);
        _body.getChildren().add(text);

    }

    EventHandler<MouseEvent> mouseEntered = new EventHandler<MouseEvent>() {
        public void handle(MouseEvent mouseEvent) {
            body.setStroke(AMOEBA_SELECTED_COLOR);
            body.fireEvent(new ActionEvent());
        }
    };

    EventHandler<MouseEvent> mouseExited = new EventHandler<MouseEvent>() {
        public void handle(MouseEvent mouseEvent) {
            body.setStroke(AMOEBA_COLOR);
            body.fireEvent(new ActionEvent());
        }
    };

    EventHandler<MouseEvent> mouseClickHandler = new EventHandler<MouseEvent>() {
        public void handle(MouseEvent mouseEvent) {

        }
    };

}

enum Size {
    SMALL, MEDIUM, LARGE;
}
