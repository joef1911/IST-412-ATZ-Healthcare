/**Data model of patient info.
 * Data is pulled from here for
 *      -View.informationView
 *      -View.editInformationView
 *      -View.careInstructionsView
 * Interacts with
 *      -Controller.IST412_Group1
*/
package ist412_group1.Model;

import java.util.ArrayList;

public class patient {
    private ArrayList <String> patientData;
    String patientId;
    
    //Constructor in progress
    public patient(ArrayList<String> patientData, String patientId) {
        this.patientData = patientData;
        this.patientId = patientId;
    }

    /**
     * Getter for patient's record.
     * @return patientData
     */
    public ArrayList<String> getPatientData() {
        return patientData;
    }

    /**
     * Setter for patient's record.
     * @param patientData 
     */
    public void setRecords(ArrayList<String> patientData) {
        this.patientData = patientData;
    }
    
    /**
     * Getter for patient's record.
     * @return patientId
     */
    public String getPatientId() {
        return patientId;
    }
    
    /**
     * Setter for patient's record.
     * @param patientId 
     */
    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }    
    
}
