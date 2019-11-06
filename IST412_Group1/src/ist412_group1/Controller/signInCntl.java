/**Functionality controller of signInView.
 * Interacts with 
 *      -Controller.IST412_Group1
 *      -View.signInView
 * Controls signInView.
*/
package ist412_group1.Controller;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class signInCntl implements Initializable
{
    IST412_Group1 main;
    @FXML TextField enterUserName;
    @FXML TextField enterPassword;
    @FXML AnchorPane ap;
    @FXML Text feedbackText;
    
        public signInCntl(IST412_Group1 a)
    {
        main = a;
      
    }
    
        @FXML
    public void submit(ActionEvent e) throws Exception{
        System.out.println(main);
        String b = enterUserName.getText();
        String c = enterPassword.getText();
        main.passStage((Stage)ap.getScene().getWindow());
        main.authenticate(b, c);
    }
    
    
        @Override
    public void initialize(URL location, ResourceBundle resources) {
       
    }
    
    public signInCntl(){
        
    }

    
    public void setFeedbackText(String text) {
        feedbackText.setText(text);
    }
    


}
