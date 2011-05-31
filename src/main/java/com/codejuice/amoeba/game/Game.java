package com.codejuice.amoeba.game;

import com.codejuice.amoeba.entity.Amoeba;
import com.codejuice.amoeba.entity.Cell;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Game extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        Scene scene = new Scene(new Group(), 400, 200, Color.BLACK);
        stage.setScene(scene);

        ((Group) scene.getRoot()).getChildren().add(new Amoeba(50, 100, 40)._body);
        ((Group) scene.getRoot()).getChildren().add(new Amoeba(350, 100, 60)._body);

        ((Group) scene.getRoot()).getChildren().add(new Cell(200, 100).body);

        stage.setVisible(true);

    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}
