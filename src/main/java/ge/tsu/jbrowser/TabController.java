package ge.tsu.jbrowser;

import javafx.concurrent.Worker.State;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

import java.net.URL;
import java.util.ResourceBundle;

public class TabController implements Initializable {

    public TextField textField;
    public WebView webView;

    private WebEngine webEngine;
    private Tab tab;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        webEngine = webView.getEngine();
        webEngine.getLoadWorker().stateProperty().addListener((ov, oldState, newState) -> {
            if (newState == State.SUCCEEDED) {
                tab.setText(webEngine.getTitle());
            }
        });
    }

    public void onGoClick(ActionEvent event) {
        webEngine.load(autoPrefix(textField.getText()));
    }

    private String autoPrefix(String url) {
        if (!url.startsWith("http://")
                && !url.startsWith("https://")) {
            url = "http://" + url;
        }
        return url;
    }

    public void setTab(Tab tab) {
        this.tab = tab;
    }

}