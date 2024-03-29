/**
 * Main Controller that interacts and initializes all other controllers
 * Starting point of the Application.
 * Initializes signInView from the start of the app.
 */
package ist412_group1.Controller;
import ist412_group1.Model.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;

public class IST412_Group1 extends Application {
    UserDataBase data = new UserDataBase(this);
    PatientDatabase patDat = new PatientDatabase(this);
    signInCntl signIn = new signInCntl(this);
    informationViewCntl infoCntl = new informationViewCntl(this);
    careInstructionsViewCntl careCntl = new careInstructionsViewCntl(this);
    editInfoViewCntl editCntl = new editInfoViewCntl(this);
    doctorsPageCntl taskCntl = new doctorsPageCntl(this);
    User activeUser;
    int oneUserLoggedIn = 0;
    Stage mainStage;
    public static void main(String[] args) 
    {
        Application.launch(args);
    }
     
    @Override
    public void start(Stage stage) throws Exception
    {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/resources/signInView.fxml"));
        loader.setController(signIn);
        Parent root = loader.load();
        Scene scene = new Scene(root);    
        stage.setScene(scene);
        stage.show(); 
        
    }
    
   public void startCareInstructionsView(Stage stage) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/resources/careInstructionsView.fxml"));
        loader.setController(careCntl);
        Parent root = loader.load();
        Scene scene = new Scene(root);    
        stage.setScene(scene);
        stage.show();
        populateCareInstructions();
   }
   
   public void startEditInfoView(Stage stage) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/resources/editInfoView.fxml"));
        loader.setController(editCntl);
        Parent root = loader.load();
        Scene scene = new Scene(root);    
        stage.setScene(scene);
        stage.show();
        editCntl.populateText();
   }
   
      public void startInformationView(Stage stage) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/resources/informationView.fxml"));
        loader.setController(infoCntl);
        Parent root = loader.load();
        Scene scene = new Scene(root);    
        System.out.println(stage);
        System.out.println(scene);
        stage.setScene(scene);
        stage.show();
        populateViewText();
   }
      
      public void startDoctorsPage(Stage stage) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/resources/doctorsPageView.fxml"));
        loader.setController(taskCntl);                                                                   
        Parent root = loader.load();
        Scene scene = new Scene(root);    
        stage.setScene(scene);
        stage.show();
        taskCntl.populateText();
   }
      
      public void proceedToInformation() throws Exception{
          startInformationView(mainStage);
      }
      
      public void authenticate(String a, String b) throws Exception{
          data.authenticate(a, b);
      }
      
      public void setLoggedIn(User a){
          oneUserLoggedIn = 1;
          activeUser = a;
          
      }
      
      public void passStage(Stage stage){
        mainStage = stage;
      }
    
      public void fullLogout(){
          data.fullLogout();
          showLogOutMsg();
      }
      
      public patient passPatient(){
          System.out.println(patDat.getPatient(1).getPatientName());
           return patDat.getPatient(1);
      }
      
      public void populateViewText(){
          infoCntl.populateText();
      }
      
      public void populateCareInstructions(){
          careCntl.populateText();
      }

    public void setFeedbackText(String text) {
          signIn.setFeedbackText(text);
      }
    
    private void showLogOutMsg() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Logout Update");
        alert.setHeaderText(null);
        alert.setContentText("You have been logged out.");
        alert.showAndWait();
    }
    
    public void showNonPermMsg() {                     
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Permission Denied");
        alert.setHeaderText(null);
        alert.setContentText("You don't have access to this function.");
        alert.showAndWait();
    }
    
    public void showSuccessEditMsg() {                
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Successful Edit");
        alert.setHeaderText(null);
        alert.setContentText("You have updated the information.");
        alert.showAndWait();
    }
    
        public void showLoginError() {                
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Failed Login");
        alert.setHeaderText(null);
        alert.setContentText("Wrong Username and Password");
        alert.showAndWait();
    }
    
    public User passUser(){
        return activeUser;
    }
    
    public void dataUpdate(int a, patient b){
        patDat.edit(a, b);
    }
    
}
