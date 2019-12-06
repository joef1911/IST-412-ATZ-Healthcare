package ist412_group1.Controller;

import ist412_group1.Model.patient;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class doctorsPageCntl {
    IST412_Group1 main;
    patient patData;
    @FXML Text patientNameText;
    @FXML Text patientIDText;
    @FXML Button backBut;
    @FXML Button editInfoBut;
    @FXML Button taskBut;
    @FXML BorderPane bp;
    @FXML TextField taskField;

    
    public doctorsPageCntl(IST412_Group1 a){
        main = a;
        patData = main.passPatient();
    }
    
        @FXML
        public void back(ActionEvent e) throws Exception{
            System.out.println(main);
            main.startInformationView((Stage)bp.getScene().getWindow());
        }
        
        @FXML
        public void viewEditInfo(ActionEvent e) throws Exception{
            if(main.passUser().checkPerm() == 1){
               main.startEditInfoView((Stage)bp.getScene().getWindow()); 
            }
            else{
                main.showNonPermMsg();
            }
        }
        
        @FXML
        public void assignTask(ActionEvent e) throws Exception{
            if(taskField.toString().isEmpty()){
                main.startInformationView((Stage)bp.getScene().getWindow());
            }
            else{
                patData.assignTasks(taskField.getText());
                int Id = Integer.parseInt(patData.getPatientId());
                main.dataUpdate(Id - 1, patData);
                main.startInformationView((Stage)bp.getScene().getWindow());
                main.showSuccessEditMsg();
            }
        }
        
        public void populateText(){
           patientNameText.setText(patData.getPatientName());
           patientIDText.setText(patData.getPatientId());
           
    }
    
}
