package ge.tsu.jbrowser;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    public TabPane tabPane;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        createNewEmptyTab();
    }

    private void createNewEmptyTab() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(JBrowser.class.getResource("tab.fxml"));
            tabPane.getTabs().add(
                    new Tab("Empty tab", fxmlLoader.load())
            );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}