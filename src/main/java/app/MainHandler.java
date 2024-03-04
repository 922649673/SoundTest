package app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.stage.StageStyle;
import java.io.IOException;

public class MainHandler extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(getClass().getResource("main.fxml"));
        root.getStylesheets().add(getClass().getResource("style.css").toExternalForm());

        stage.setMinWidth(816);
        stage.setMinHeight(539);
        stage.setScene(new Scene(root));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
        System.out.println("AAAAA");

        /*
        String musicFile = "C:\\Users\\bryan\\Downloads\\Edge_Of_The_Earth.mp3";
        Media sound = new Media(new File(musicFile).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();*/

    }
}