module ge.tsu.jbrowser {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.kordamp.ikonli.core;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.ikonli.fontawesome5;

    opens ge.tsu.jbrowser to javafx.fxml;
    exports ge.tsu.jbrowser;
}