package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;

public class TwoWindowController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView image_button_cat;

    @FXML
    void initialize() {
        assert image_button_cat != null : "fx:id=\"image_button_cat\" was not injected: check your FXML file 'TwoWindow.fxml'.";

    }

}
