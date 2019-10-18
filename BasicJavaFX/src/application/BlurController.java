package application;

import javafx.fxml.FXML;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.ImageView;

public class BlurController {
	
	@FXML
    private ImageView imageView;   


	@FXML
    public void setblur() {           
             imageView.setEffect(new GaussianBlur(20));

    }
	
	@FXML
	private void handleClose() {
	
	        System.exit(0);
	}
	
}
