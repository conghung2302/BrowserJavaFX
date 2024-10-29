module com.browser.browserwebview {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.browser.browserwebview to javafx.fxml;
    exports com.browser.browserwebview;
}