package org.example.financetracker_2;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import java.io.IOException;

public class HelloController {
    @FXML
    private Button switchButton;

    @FXML
    public void handleWechseln(javafx.event.ActionEvent actionEvent)
    {
        Parent neueAnsicht = null;
        try {
            neueAnsicht = FXMLLoader.load(getClass().getResource("Page2.fxml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Scene aktuelleScene = switchButton.getScene();

        aktuelleScene.setRoot(neueAnsicht);
    }
}
