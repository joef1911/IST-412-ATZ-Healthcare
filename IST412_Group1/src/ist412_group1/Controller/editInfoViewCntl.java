/**
 * Functionality controller of editing information view
 * Interacts with 
 *      -Controller.IST412_Group1
 *      -View.editInfoView
 *      -Model.patient
 * Controls editInfoView
*/
package ist412_group1.Controller;

import ist412_group1.Model.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class editInfoViewCntl {
    IST412_Group1 main;
    @FXML AnchorPane ap;
    @FXML Text patientNameText;
    @FXML Text patientIdText;
    @FXML TextField bloodPressureText;
    @FXML TextField weightText;
    @FXML TextField activityLvlText;
    @FXML TextField pastIssuesText;
    @FXML TextField familyPatternsText;
    @FXML TextField currentMedicationsText;
    @FXML TextField currentHabitsText;
    @FXML TextField careInstructionsText;
    @FXML Button cancelBut;
    patient patData;
    
    
    public editInfoViewCntl(IST412_Group1 a){
        main = a;
        patData = main.passPatient();
    }
    
        @FXML
        public void back(ActionEvent e) throws Exception{
            System.out.println(main);
            main.startInformationView((Stage)ap.getScene().getWindow());
        }
    
    public void populateText(){
           patientNameText.setText(patData.getPatientName());
           patientIdText.setText(patData.getPatientId());
           bloodPressureText.setText(patData.getPatientBloodPressure());
           weightText.setText(patData.getPatientWeight());
           activityLvlText.setText(patData.getPatientFamilyPatterns());
           pastIssuesText.setText(patData.getPatientPastIssues());
           familyPatternsText.setText(patData.getPatientFamilyPatterns());
           currentMedicationsText.setText(patData.getPatientCurrentMedications());
           currentHabitsText.setText(patData.getPatientCurrentHabits());
           careInstructionsText.setText(patData.getCareInstructions());
    }
    
    @FXML
    public void submit(ActionEvent e) throws Exception{
        int Id = Integer.parseInt(patData.getPatientId());
        patData.setCareInstructions(careInstructionsText.getText());
        patData.setPatientActivityLvl(activityLvlText.getText());
        patData.setPatientBloodPressure(bloodPressureText.getText());
        patData.setPatientCurrentHabits(currentHabitsText.getText());
        patData.setPatientCurrentMedications(currentMedicationsText.getText());
        patData.setPatientFamilyPatterns(familyPatternsText.getText());
        patData.setPatientPastIssues(pastIssuesText.getText());
        patData.setPatientWeight(weightText.getText());
        main.dataUpdate(Id - 1, patData);
        main.startInformationView((Stage)ap.getScene().getWindow());
        main.showSuccessEditMsg();
    }
        

        
        
}
