package com.kavee.gearrentpro.ui;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DashboardUI {

    private Scene scene;

    public DashboardUI(Stage stage) {

        Label title = new Label("Welcome to GearRentPro Dashboard");
        title.setStyle("-fx-font-size: 18px; -fx-font-weight: bold;");

        Button btnBranches = new Button("Manage Branches");
        Button btnEquipment = new Button("Manage Equipment");
        Button btnRentals = new Button("Manage Rentals");
        Button btnExit = new Button("Exit");

        btnExit.setOnAction(e -> stage.close());

        VBox root = new VBox(15);
        root.setPadding(new Insets(20));
        root.getChildren().addAll(
                title,
                btnBranches,
                btnEquipment,
                btnRentals,
                btnExit
        );

        scene = new Scene(root, 400, 300);
    }

    public Scene getScene() {
        return scene;
    }
}
