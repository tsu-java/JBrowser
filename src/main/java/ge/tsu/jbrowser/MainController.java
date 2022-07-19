package ge.tsu.jbrowser;

import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.StackPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    public TabPane tabPane;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        createNewEmptyTab();
    }

    public void onPlusTabClick(Event event) {
        createNewEmptyTab();
    }

    private void createNewEmptyTab() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(JBrowser.class.getResource("tab.fxml"));
            Tab tab = new Tab("Empty tab", fxmlLoader.load());
            tabPane.getTabs().add(tabPane.getTabs().size() - 1, tab);
            tabPane.getSelectionModel().select(tab);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}