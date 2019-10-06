/**
 * Main Controller that interacts and initializes all other controllers
 * Starting point of the Application.
 * Initializes signInView from the start of the app.
 */
package ist412_group1.Controller;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import ist412_group1.Model.*;
import ist412_group1.View.*;


public class IST412_Group1 extends Application {
    
    /**
     * This is the methods that starts the UI.
     * @param primaryStage 
     */
    @Override
    public void start(Stage primaryStage) {
        
    }

    /**
     * This is the main method. It instantiates informationViewCntl.
     * @param args 
     */
   
    public static void main(String[] args) {    
        informationViewCntl informationViewCntlObj = new informationViewCntl();
        launch(args);
    }
    
}
