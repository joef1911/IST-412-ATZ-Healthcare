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
     * Instantiates the 3 basic patients
     */
    public informationViewCntl() {
        ist412_group1.Model.patient patient1 = new ist412_group1.Model.patient();
        ist412_group1.Model.patient patient2 = new ist412_group1.Model.patient();
        ist412_group1.Model.patient patient3 = new ist412_group1.Model.patient();
    }
}
