
package arianayourstruly;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author santo
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label lblMensagem;
    private Button btnCLick;
    
    @FXML
    private void cliqueBotao(ActionEvent event) {
         lblMensagem.setText("1-Honeymoon Avenue\n"
                 + "2-Baby I\n"
                 + "3-Rigth There\n"
                 + "4-Tattoed Heart"
                 + "5-Lovin It\n"
                 + "6-Piano\n"
                 + "7-Daydreamin\n"
                 + "8-The Way\n"
                 + "9-You ll Never Know\n"
                 + "10-Almost ls Never Enough\n"
                 + "11-Popular Song\n"
                 + "12-Better Left Unsaid");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
