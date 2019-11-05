/**
 * Functionality controller of care instructions view
 * Interacts with 
 *      -Controller.IST412_Group1
 *      -Model.user
 *      -Model.patient
 *      -View.careInstructionsView
 * Controls the careInstructionsView
*/


package ist412_group1.Controller;

import ist412_group1.Model.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class careInstructionsViewCntl {
    IST412_Group1 main;
    @FXML AnchorPane ap;
    @FXML Text careInstructionsText;
    patient patData;
    public careInstructionsViewCntl(IST412_Group1 a){
        main = a;
        patData = main.passPatient();
    }
    
        @FXML
        public void logout(ActionEvent e){
            main.fullLogout();
            System.exit(0);
        }
        
        @FXML
        public void back(ActionEvent e) throws Exception{
            main.startInformationView((Stage)ap.getScene().getWindow());
        }
        
        public void populateText(){
            System.out.println(patData.getCareInstructions());
           careInstructionsText.setText(patData.getCareInstructions());
        }
        
}
