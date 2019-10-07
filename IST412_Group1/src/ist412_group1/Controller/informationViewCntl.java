/**Functionality of information view controller.
 * Interacts with 
 *      -Controller.IST412_Group1
 *      -View.informationView
 *      -Model.patient
 * Transitions to all other controllers.
 * Controls editInfoView.
*/
package ist412_group1.Controller;

/**
 *
 * @author Dalton
 */
import ist412_group1.Model.*;
import ist412_group1.View.*;

public class informationViewCntl {
    
    
    /**
     * Constructor for informationViewCntl
     * Instantiates and defines the 3 basic patient objects
     */
    public informationViewCntl() { 
        PatientDatabase patientDatabase = new PatientDatabase();       
    }
}
