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
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class editInfoViewCntl {
    IST412_Group1 main;
    @FXML Text patientNameText;
    @FXML Text patientIdText;
    @FXML TextField bloodPressureText;
    @FXML TextField weightText;
    @FXML TextField activityLvlText;
    @FXML TextField pastIssuesText;
    @FXML TextField familyPatternsText;
    @FXML TextField currentMedicationsText;
    @FXML TextField currentHabitText;
    @FXML TextField careInstructionsText;
    
    public editInfoViewCntl(IST412_Group1 a){
        main = a;
    }
    
    //add method to edit text areas
}
