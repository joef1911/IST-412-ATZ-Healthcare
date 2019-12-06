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
    @FXML Button doctorsPageBut;
    @FXML AnchorPane ap;
    @FXML Text patientNameText;
    @FXML Text patientCurrentMedsText;
    @FXML Text patientWeightText;
    @FXML Text familyPatterns;
    @FXML Text allergiesText;
    @FXML Text habitsText;
    @FXML Text activityLvlText;
    @FXML Text pastIssuesText;
    @FXML Text tasksText;
    patient patData;
    
    public informationViewCntl() { 
       
    }
    
        public informationViewCntl(IST412_Group1 a) { 
        main = a;    
        patData = main.passPatient();
    }
        
        public void populateText(){
           patientNameText.setText(patData.getPatientName());
           patientWeightText.setText(patData.getPatientWeight());
           patientCurrentMedsText.setText(patData.getPatientCurrentMedications());
           familyPatterns.setText("Family Patterns: " + patData.getPatientFamilyPatterns());
           allergiesText.setText(patData.getPatientAllergies());
           activityLvlText.setText(patData.getPatientActivityLvl());
           habitsText.setText(patData.getPatientCurrentHabits());
           pastIssuesText.setText(patData.getPatientPastIssues());
           tasksText.setText(patData.getTasks());
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
        
        @FXML
        public void viewDoctorsPage(ActionEvent e) throws Exception{
            main.startDoctorsPage((Stage)ap.getScene().getWindow());
        }
        
//        @FXML
//        public void viewEditInfo(ActionEvent e) throws Exception{
//            if(main.passUser().checkPerm() == 1){
//               main.startEditInfoView((Stage)ap.getScene().getWindow()); 
//            }
//            else{
//                main.showNonPermMsg();
//            }
//        }
        
}
