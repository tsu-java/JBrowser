package ge.tsu.jbrowser;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class JBrowser extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(JBrowser.class.getResource("main.fxml"));
        Scene mainScene = new Scene(fxmlLoader.load(), 800, 600);
        addStyle(mainScene);
        stage.setTitle("JBrowser");
        stage.setScene(mainScene);
        stage.show();
    }

    /**
     * We add style.css here and also in main.fxml file for development purposes.
     *
     * @param scene
     */
    private void addStyle(Scene scene) {
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
    }

    public static void main(String[] args) {
        launch();
    }

}