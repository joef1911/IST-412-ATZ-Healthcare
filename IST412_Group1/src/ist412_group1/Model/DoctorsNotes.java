
package ist412_group1.Model;

import java.util.HashMap;

/**
 *
 * @author xiaohan
 */
public class DoctorsNotes {
    HashMap<Integer, String> prescriptionMap;
    HashMap<Integer, String> careInstructionMap;
    String patientID;

    public DoctorsNotes() {
        this.prescriptionMap = new HashMap<Integer, String>();
        this.careInstructionMap = new HashMap<Integer, String>();
    }
    
    public void addNewInstruction(int patientID, String instruction){
        careInstructionMap.put(patientID, instruction);
    }
    
    public void addNewPrescription(int patientID, String precription){
        prescriptionMap.put(patientID, precription);
    }
    
    public void appendInstruction(int patientID, String instruction){
        careInstructionMap.put(patientID, careInstructionMap.get(patientID)+instruction);
    }
    
    public void appendPrescription(int patientID, String precription){
        prescriptionMap.put(patientID, prescriptionMap.get(patientID)+precription);
    }
}


