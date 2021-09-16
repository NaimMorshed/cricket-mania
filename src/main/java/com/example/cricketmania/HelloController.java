package com.example.cricketmania;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.util.Objects;

public class HelloController {
    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button signInBtn;

    @FXML
    private Label registerLabel;

    @FXML
    private Label errorLabel;

    public void signIn(ActionEvent event) {
        errorLabel.setVisible(true);
        String userName = usernameField.getText();
        String pass = passwordField.getText();
        if (Objects.equals(userName, "admin") && Objects.equals(pass, "admin")) {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Welcome.fxml"));
                Parent root = fxmlLoader.load();
                Stage stage = new Stage();
                stage.setTitle("CricketMania | Home");
                stage.setScene(new Scene(root));
                WelcomeController controller = fxmlLoader.getController();
                stage.show();
            } catch (Exception e) {
                System.out.println(e);
            }
        } else {
            errorLabel.setVisible(true);
        }
    }
}
