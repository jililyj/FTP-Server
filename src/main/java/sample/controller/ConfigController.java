package sample.controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class ConfigController {
    public Button serverBtn;
    public Button configBtn;
    public Button fixBtn;
    public Button save;

    public void clickserverBtn(MouseEvent mouseEvent) {
    }

    public void changeMouse(MouseEvent mouseEvent) {
        serverBtn.setCursor(Cursor.HAND);
        configBtn.setCursor(Cursor.HAND);
        fixBtn.setCursor(Cursor.HAND);
        save.setCursor(Cursor.HAND);
    }
    public void clickFixBtn(MouseEvent mouseEvent) throws IOException {
    }
}
