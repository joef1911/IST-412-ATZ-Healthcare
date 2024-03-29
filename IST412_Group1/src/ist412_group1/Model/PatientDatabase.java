/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist412_group1.Model;

import ist412_group1.Controller.IST412_Group1;
import java.util.ArrayList;

public class PatientDatabase {

   private ArrayList<patient> patientData = new ArrayList<patient>();
   private final IST412_Group1 main;
    public PatientDatabase(IST412_Group1 a) {
        main = a;
        patient patientOne = new patient("Damien Marco", "1", "110/80", "145", "High", "None", "Heart disease", "None", "Peanut Butter", "Smoking");
        patient patientTwo = new patient("Angela Becker", "2", "128/80", "172", "Low", "Laser Eye Surgery", "None", "Anti-Depressants", "None", "None");
        patientOne.setCareInstructions("Stop Smoking");
        patientTwo.setCareInstructions("Take Anti Depressants twice a day");
        patientData.add(patientOne);
        patientData.add(patientTwo);       
    }
    
    public patient getPatient(int a){
        return patientData.get(a);
    }
    
    public void edit(int a, patient b){
        patientData.set(a, b);
    }
    

    
}
