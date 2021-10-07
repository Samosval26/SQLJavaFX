package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class ThirdController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField login_field3;

    @FXML
    private TextField password_field;

    @FXML
    private Button signUpButton;

    @FXML
    private RadioButton signUpCheckBoxFemale;

    @FXML
    private RadioButton signUpCheckBoxmale;

    @FXML
    private TextField signUpCountry;

    @FXML
    private TextField signUpName;

    @FXML
    private TextField signUpName_lastname;

    @FXML
    void initialize() {
    	signUpButton.setOnAction(event -> {
    		
    		
    		signUpNewUser();
    		
    	});
      
    }

	private void signUpNewUser() {
    	DatabaseHandler dbHandler = new DatabaseHandler();


		String firstName = signUpName.getText();
		String lastName = signUpName_lastname.getText();
		String userName = login_field3.getText();
		String password = password_field.getText();
		String location = signUpCountry.getText();
		String gender = "";
		if (signUpCheckBoxmale.isSelected())
			gender = "men";
		else 
			gender = "women";
		
		User user = new User(firstName, lastName, userName, password, location, gender);
		
		
			dbHandler.signUpUser(user);
		
		
	}

}
