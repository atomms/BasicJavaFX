package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * 
 * @author ernesto
 *
 */

public class BlurController {
	

	
	@FXML
	private Pane mypane;

	

	@FXML
    public void setblur() {           
             mypane.setEffect(new GaussianBlur(5));

    }
	
	@FXML
    public void setfocus() {           
             mypane.setEffect(new GaussianBlur(0));
    }
	
	@FXML
	private void handleClose() {
	
        System.exit(0);System.exit(0);
	}
	
	@FXML
	private void openStage() {
	
		try {
			
			//añadir
			FXMLLoader loader = new FXMLLoader(getClass()
					.getResource("forest.fxml"));
			//añadir
			mypane = (AnchorPane) loader.load();
			
			Scene scene = new Scene(mypane);
			Stage stage = new Stage();
			stage.setScene(scene);
			stage.show();
		} catch (Exception e)  {
			// TODO: handle exception
		}
		
	}
	
}
