/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist412_group1.Model;

import java.util.ArrayList;

/**
 *
 * @author Joe Fleck
 */
public class PatientDatabase {
    
    ArrayList<String> patient1Data = new ArrayList();
    ArrayList<String> patient2Data = new ArrayList();
    ArrayList<String> patient3Data = new ArrayList();
    
    final String patient1Id;
    final String patient2Id;
    final String patient3Id;
   
    public PatientDatabase() {
        String patient1BloodPressure = "110/80";
        String patient1Weight = "145";
        String patient1ActivityLvl = "High";
        String patient1PastIssues = "None";
        String patient1FamilyPatterns = "Heart disease";
        String patient1CurrentMedications = "None";
        String patient1Allergies = "None";
        String patient1CurrentHabits = "None";
        
        patient1Data.add(patient1BloodPressure);
        patient1Data.add(patient1Weight);
        patient1Data.add(patient1ActivityLvl);
        patient1Data.add(patient1PastIssues);
        patient1Data.add(patient1FamilyPatterns);
        patient1Data.add(patient1CurrentMedications);
        patient1Data.add(patient1Allergies);
        patient1Data.add(patient1CurrentHabits);
        
        patient1Id = "11111";       
        ist412_group1.Model.patient patient1 = new ist412_group1.Model.patient(patient1Data, patient1Id);
        
        
        String patient2BloodPressure = "113/80";
        String patient2Weight = "165";
        String patient2ActivityLvl = "Medium";
        String patient2PastIssues = "Appendix Removed - 2009";
        String patient2FamilyPatterns = "Breast Cancer";
        String patient2CurrentMedications = "None";
        String patient2Allergies = "Peanut Butter";
        String patient2CurrentHabits = "Smoking";
        
        patient2Data.add(patient2BloodPressure);
        patient2Data.add(patient2Weight);
        patient2Data.add(patient2ActivityLvl);
        patient2Data.add(patient2PastIssues);
        patient2Data.add(patient2FamilyPatterns);
        patient2Data.add(patient2CurrentMedications);
        patient2Data.add(patient2Allergies);
        patient2Data.add(patient2CurrentHabits);
        
        patient2Id = "22222";        
        ist412_group1.Model.patient patient2 = new ist412_group1.Model.patient(patient2Data, patient2Id);
        
               
        String patient3BloodPressure = "128/80";
        String patient3Weight = "172";
        String patient3ActivityLvl = "Low";
        String patient3PastIssues = "Laser eye surgery - 2007";
        String patient3FamilyPatterns = "None";
        String patient3CurrentMedications = "Anti-Depressants";
        String patient3Allergies = "None";
        String patient3CurrentHabits = "None";
        
        patient3Data.add(patient3BloodPressure);
        patient3Data.add(patient3Weight);
        patient3Data.add(patient3ActivityLvl);
        patient3Data.add(patient3PastIssues);
        patient3Data.add(patient3FamilyPatterns);
        patient3Data.add(patient3CurrentMedications);
        patient3Data.add(patient3Allergies);
        patient3Data.add(patient3CurrentHabits);
        
        patient3Id = "33333";
        ist412_group1.Model.patient patient3 = new ist412_group1.Model.patient(patient3Data, patient3Id);
    }

    public ArrayList<String> getPatient1Data() {
        return patient1Data;
    }

    public void setPatient1Data(ArrayList<String> patient1Data) {
        this.patient1Data = patient1Data;
    }

    public ArrayList<String> getPatient2Data() {
        return patient2Data;
    }

    public void setPatient2Data(ArrayList<String> patient2Data) {
        this.patient2Data = patient2Data;
    }

    public ArrayList<String> getPatient3Data() {
        return patient3Data;
    }

    public void setPatient3Data(ArrayList<String> patient3Data) {
        this.patient3Data = patient3Data;
    }

    public String getPatient1Id() {
        return patient1Id;
    }

    public String getPatient2Id() {
        return patient2Id;
    }

    public String getPatient3Id() {
        return patient3Id;
    }
    
}
