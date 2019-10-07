/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist412_group1.testHarness;
import ist412_group1.Controller.*;
import ist412_group1.Model.*;
import ist412_group1.View.*;
import java.util.ArrayList;
import static javafx.application.Application.launch;
import static junit.framework.Assert.*;
import org.junit.Test;
/**
 *
 * @author Dalton
 */


public class UnitTest {
        private final static UserDataBase base = new UserDataBase();
        private final static User user = base.getDataBase().get(1);
        private final static String firstName = base.getDataBase().get(1).getFirstName();
        
        private final static PatientDatabase patientBase = new PatientDatabase();
        private final static ArrayList<String> patientData = patientBase.getPatient1Data();
        private final static String patientId = patientBase.getPatient1Id();
     
    @Test
    public void testDataBase(){
        assertNotNull("Database is Populated", base);
        assertNotNull("User Populated", user);
        assertNotNull("User info Populated", firstName);
    }
    
    @Test
    public void testPatientData(){
        assertNotNull("Patient database exists", patientBase);
        assertNotNull("Patient database is populated", patientData);
        assertNotNull("Patient has a patient ID", patientId);
    }
    

}
