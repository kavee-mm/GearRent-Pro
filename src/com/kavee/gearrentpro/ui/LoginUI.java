package com.kavee.gearrentpro.ui;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class LoginUI {

    public Scene getScene() {
        VBox root = new VBox(10);
        root.setPadding(new Insets(20));

        Label title = new Label("Login");
        Button loginBtn = new Button("Login");

        root.getChildren().addAll(title, loginBtn);

        return new Scene(root, 350, 300);
    }
}
