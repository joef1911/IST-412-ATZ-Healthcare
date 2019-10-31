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
        String patientName;
        String patientId;  
        String patientBloodPressure;
        String patientWeight;
        String patientActivityLvl;
        String patientPastIssues;
        String patientFamilyPatterns;
        String patientCurrentMedications;
        String patientAllergies;
        String patientCurrentHabits;

    public patient(String patientName, String patientId, String patient1BloodPressure, String patient1Weight, String patient1ActivityLvl, String patient1PastIssues, String patient1FamilyPatterns, String patient1CurrentMedications, String patient1Allergies, String patient1CurrentHabits) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.patientBloodPressure = patient1BloodPressure;
        this.patientWeight = patient1Weight;
        this.patientActivityLvl = patient1ActivityLvl;
        this.patientPastIssues = patient1PastIssues;
        this.patientFamilyPatterns = patient1FamilyPatterns;
        this.patientCurrentMedications = patient1CurrentMedications;
        this.patientAllergies = patient1Allergies;
        this.patientCurrentHabits = patient1CurrentHabits;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getPatientBloodPressure() {
        return patientBloodPressure;
    }

    public String getPatientWeight() {
        return patientWeight;
    }

    public String getPatientActivityLvl() {
        return patientActivityLvl;
    }

    public String getPatientPastIssues() {
        return patientPastIssues;
    }

    public String getPatientFamilyPatterns() {
        return patientFamilyPatterns;
    }

    public String getPatientCurrentMedications() {
        return patientCurrentMedications;
    }

    public String getPatientAllergies() {
        return patientAllergies;
    }

    public String getPatientCurrentHabits() {
        return patientCurrentHabits;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public void setPatientBloodPressure(String patientBloodPressure) {
        this.patientBloodPressure = patientBloodPressure;
    }

    public void setPatientWeight(String patientWeight) {
        this.patientWeight = patientWeight;
    }

    public void setPatientActivityLvl(String patientActivityLvl) {
        this.patientActivityLvl = patientActivityLvl;
    }

    public void setPatientPastIssues(String patientPastIssues) {
        this.patientPastIssues = patientPastIssues;
    }

    public void setPatientFamilyPatterns(String patientFamilyPatterns) {
        this.patientFamilyPatterns = patientFamilyPatterns;
    }

    public void setPatientCurrentMedications(String patientCurrentMedications) {
        this.patientCurrentMedications = patientCurrentMedications;
    }

    public void setPatientAllergies(String patientAllergies) {
        this.patientAllergies = patientAllergies;
    }

    public void setPatientCurrentHabits(String patientCurrentHabits) {
        this.patientCurrentHabits = patientCurrentHabits;
    }
    
      



    

    
}
