/**
 * Data model of doctors
 * Inherit from 
 *  - Model.user
*/
package ist412_group1.Model;

import ist412_group1.Controller.IST412_Group1;
import java.util.Dictionary;
import java.util.Hashtable;

/**
 *
 * @author Xiaohan
 */
public class Doctor extends User{
    private int type; //Doctor types (eg. 1 for Endocrinologist, 2 for Orthopedist, 3 for Urologist)
    String jobNumber;
    PatientDatabase p = new PatientDatabase(new IST412_Group1());
    DoctorsNotes note = new DoctorsNotes();

    public Doctor(String fName, String lName, String uName, String password, int patientLink, int type) {
        super(fName, lName, uName, password, patientLink);
        this.type = type;
    }

    //Getters setters

    public String getJobNumber() {
        return jobNumber;
    }

    public void setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber;
    }
    
    //functions 
    /**
     * doctors can view patient's medical record
     * @param patientID 
     * @return record
     */
    public Dictionary viewPatientRecord(int patientID){
        Dictionary record = new Hashtable();
        patient patient = p.getPatient(patientID);
        
        record.put("bloodPressure", patient.getPatientBloodPressure());
        record.put("weight", patient.getPatientWeight());
        record.put("ActivityLvl", patient.getPatientActivityLvl());
        record.put("PastIssue", patient.getPatientPastIssues());
        record.put("FamilyPatterns", patient.getPatientFamilyPatterns());
        record.put("CurrentMedications", patient.getPatientCurrentMedications());
        record.put("Allergies", patient.getPatientAllergies());
        record.put("CurrentHabits", patient.getPatientCurrentHabits());
        
        return record;
    }
    
    /**
     * doctors can edit patient record
     * @param patientID 
     */
    public void editPatientRecord(int patientID){
        
    }
    
    /**
     * Doctors can add health care instructions
     * @param patientID 
     */
    public void addCareInstruction(int patientID, String instrcution){
        note.addNewInstruction(patientID, instrcution);
    }
    
    /**
     * Doctors can make prescriptions
     * @param patientID 
     */
    public void makePrescription(int patientID, String prescription){
        note.addNewPrescription(patientID, prescription);
    }
    
    //Doctors specialized behaviors
    
    private void addBloodTestResult(int patientID){
        
    }
    
    private void addCTScanResult(int PatientID){
        
    }
    
    private void addUrinalysisResult(int PatientID){
        
    }
    
    //Specified doctor's behavior according to type.
    public void doSpecializedBehavior(int patientID){
        if(type == 1){
            addBloodTestResult(patientID);
        } else if (type == 2){
            addCTScanResult(patientID);
        } else if(type == 3){
            addUrinalysisResult(patientID);
        }
    }
}
