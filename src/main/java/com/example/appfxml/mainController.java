package com.example.appfxml;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class mainController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        mainAnchorPane.setVisible(true);
        detailAnchorPane.setVisible(false);
        mainButtonsAnchorPane.setVisible(true);
        back_button.setVisible(false);
    }
    private TranslateTransition lateralShow, menuButtonTranslate;
    private boolean clicked = false;
    @FXML private Button menu, exit, back_button;
    @FXML private VBox lateral_menu;
    @FXML private AnchorPane mainAnchorPane, detailAnchorPane, mainButtonsAnchorPane;

    @FXML public void menuOnClick(){
        if(!clicked){
            lateralShow = new TranslateTransition(Duration.millis(200), lateral_menu);
            lateralShow.setFromX(-(lateral_menu.getMaxWidth()));
            lateralShow.setToX(0);
            lateralShow.play();

            menuButtonTranslate = new TranslateTransition(Duration.millis(200), menu);
            menuButtonTranslate.setFromX(0);
            menuButtonTranslate.setToX(lateral_menu.getMaxWidth());
            menuButtonTranslate.play();
        }
        else{
            lateralShow = new TranslateTransition(Duration.millis(200), lateral_menu);
            lateralShow.setFromX(0);
            lateralShow.setToX(-(lateral_menu.getMaxWidth()));
            lateralShow.play();

            menuButtonTranslate = new TranslateTransition(Duration.millis(200), menu);
            menuButtonTranslate.setFromX(lateral_menu.getMaxWidth());
            menuButtonTranslate.setToX(0);
            menuButtonTranslate.play();
        }
        clicked = !clicked;
    }

    @FXML public void exitOnClick(){
        System.exit(0);
    }

    @FXML public void showDetailView() {
        detailAnchorPane.setVisible(true);
        mainButtonsAnchorPane.setVisible(false);
        menu.setVisible(false);
        lateral_menu.setVisible(false);
        back_button.setVisible(true);
    }
    @FXML public void hideDetailView(){
        detailAnchorPane.setVisible(false);
        mainButtonsAnchorPane.setVisible(true);
        menu.setVisible(true);
        lateral_menu.setVisible(true);
        back_button.setVisible(false);
    }

}