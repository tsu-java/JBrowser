package ge.tsu.jbrowser;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

import java.net.URL;
import java.util.ResourceBundle;

public class TabController implements Initializable {

    public TextField textField;
    public WebView webView;

    private WebEngine webEngine;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        webEngine = webView.getEngine();
    }

    public void onGoClick(ActionEvent event) {
        webEngine.load(textField.getText());
    }
}