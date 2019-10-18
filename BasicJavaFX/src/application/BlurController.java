package application;

import javafx.fxml.FXML;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.layout.Pane;

/**
 * 
 * @author ernesto
 *
 */

public class BlurController {
	
//	@FXML
//    private ImageView imageView;   
//	private Ellipse ellipse;
	
	@FXML
	private Pane mypane;   

	
//	@FXML
//    public void setclip() {           
//        ellipse = new Ellipse();
////        circle = new Circle((imageView.getFitWidth())*0.2);
//
//        ellipse.centerXProperty().setValue(120);
//        ellipse.centerYProperty().setValue(40);
//        ellipse.radiusXProperty().setValue(90);
//        ellipse.radiusYProperty().setValue(90);
//        
////        importing and modifying sizes
////    	ellipse.radiusXProperty().setValue(imageView.getFitWidth()*0.1);
////    	ellipse.radiusYProperty().setValue(imageView.getFitHeight()*0.17);
//        
//        imageView.setClip(ellipse);
//
//////apply a shadow effect.
////        imageView.setEffect(new DropShadow(10, Color.BLACK));
//
//    }

	@FXML
    public void setblur() {           
             mypane.setEffect(new GaussianBlur(5));
//             mypane.setEffect(new GaussianBlur(10));
    }
	
	@FXML
    public void setfocus() {           
             mypane.setEffect(new GaussianBlur(0));
//             mypane.setEffect(new GaussianBlur(10));
    }
	
	@FXML
	private void handleClose() {
	
	        System.exit(0);
	}
	
}
