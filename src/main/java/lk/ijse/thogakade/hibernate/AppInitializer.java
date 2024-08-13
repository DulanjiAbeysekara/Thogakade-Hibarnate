package lk.ijse.thogakade.hibernate;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AppInitializer extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        Parent parent= FXMLLoader.load(getClass().getResource("/view/homepage.fxml"));
        stage.setScene(new Scene(parent));
        stage.setTitle("Home Page");
        stage.centerOnScreen();
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
