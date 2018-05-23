package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApp extends Application {

    private Stage primaryStage;
    private BorderPane rootLayout;

    @Override
    public void start(Stage primaryStage) {

        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Address App");

        initRootLayout();
        showPersonOverview();
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
//        primaryStage.setTitle("Hello World");
//        primaryStage.setScene(new Scene(root, 300, 275));
//        primaryStage.show();
    }

    public void initRootLayout() {
        try {

            Parent root = FXMLLoader.load(getClass().getResource("view/RootLayout.fxml")) ;
//            FXMLLoader loader = new FXMLLoader();
//            loader.setLocation(MainApp.class.getResource("RootLayout.fxml"));
//            rootLayout = (BorderPane) root.;

            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showPersonOverview() {
        try {
            Parent root = FXMLLoader.load((getClass().getResource("view/PersonOverview.fxml")));

//            FXMLLoader loader = new FXMLLoader();
//            loader.setLocation(MainApp.class.getResource(""));
//            AnchorPane personOverview = (AnchorPane) loader.load();

//            rootLayout.setCenter(personOverview);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
