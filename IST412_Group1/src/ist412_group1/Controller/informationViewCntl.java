/**Functionality of information view controller.
 * Interacts with 
 *      -Controller.IST412_Group1
 *      -View.informationView
 *      -Model.patient
 * Transitions to all other controllers.
 * Controls editInfoView.
*/
package ist412_group1.Controller;


import ist412_group1.Model.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class informationViewCntl {
    
    IST412_Group1 main;
    @FXML Button careInstructBut;
    @FXML Button logoutBut;
    @FXML Button editInfoBut;
    @FXML AnchorPane ap;
    @FXML Text patientNameText;
    @FXML Text patientHeightText;
    @FXML Text patientWeightText;
    
    public informationViewCntl() { 
       
    }
    
        public informationViewCntl(IST412_Group1 a) { 
        main = a;    
        populateText();
    }
        
        public void populateText(){
           patient a = main.passPatient(1);
           System.out.println(a.getPatientName());
           patientNameText.setText(a.getPatientName()); //not working
           patientWeightText.setText(a.getPatientWeight());
           System.out.println(patientWeightText);
        }
        
        @FXML
        public void logout(ActionEvent e){
            main.fullLogout();
            System.exit(0);
        }
        
        @FXML
        public void viewCareInstructions(ActionEvent e) throws Exception{
            main.startCareInstructionsView((Stage)ap.getScene().getWindow());
        }
}
