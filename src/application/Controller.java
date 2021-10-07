package application;

	
	
	import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import animations.Shake;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
	import javafx.scene.control.PasswordField;
	import javafx.scene.control.TextField;
import javafx.stage.Stage;

	public class Controller {

	    @FXML
	    private ResourceBundle resources;

	    @FXML
	    private URL location;

	    @FXML
	    private Button auth_sign_In_button;

	    @FXML
	    private TextField login_field;

	    @FXML
	    private Button login_sign_up_button;

	    @FXML
	    private PasswordField password_field;

	    @FXML
	    void initialize() {
	    	
	    	
	 auth_sign_In_button.setOnAction(event ->{
		 String loginText = login_field.getText().trim();
		 String loginPassword = password_field.getText().trim();	
	    	
		 if (!loginText.equals("") && !loginPassword.equals("")) 
		 	loginUser(loginText, loginPassword);
		 	
		 else 
			 System.out.println("Login  or password is empty");
	    	});
	    	
	    
	 
	    	login_sign_up_button.setOnAction( event -> {
	    		openNewScene ("/ThirdWindow.fxml");
	    	});
	    }

		private void loginUser(String loginText, String loginPassword) {
			
			
			DatabaseHandler dbHandler = new DatabaseHandler();
			User user = new User();
		
			user.setUserName(loginText);
			user.setPassword(loginPassword);
			dbHandler.getUser(user);
			ResultSet result = dbHandler.getUser(user);
			
			int counter =0;
			
			try {
				while (result.next()) {
					counter++;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			if (counter >= 1 ) {
	    		openNewScene ("/TwoWindow.fxml");
				System.out.println("Success!");
			}else {
					Shake userLoginAnim = new Shake (login_field);
					Shake userPassAnim = new Shake (password_field);
					userLoginAnim.playAnim();
					userPassAnim.playAnim();
					
				}
			}
			
		public void openNewScene (String window) {
			
			login_sign_up_button.getScene().getWindow().hide();
    		
    		FXMLLoader loader = new FXMLLoader();
    		loader.setLocation(getClass().getResource(window)); 
    		try {
				loader.load();
			} catch (IOException e) {
				e.printStackTrace();
			}
    		
    		Parent root = loader.getRoot();
    		Stage stage = new Stage();
    		stage.setScene(new Scene(root));
    		stage.showAndWait();
    		
			
		}
 		
		}

	



