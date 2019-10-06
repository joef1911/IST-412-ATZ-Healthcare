/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist412_group1.testHarness;
import ist412_group1.Controller.*;
import ist412_group1.Model.*;
import ist412_group1.View.*;
import static javafx.application.Application.launch;
import static junit.framework.Assert.*;
import org.junit.Test;
/**
 *
 * @author Dalton
 */


public class UnitTest {
        private static UserDataBase base = new UserDataBase();
        private static User user = base.getDataBase().get(1);
        private static String firstName = base.getDataBase().get(1).getFirstName();
    
     
     @Test
     public void testDataBase(){
         assertNotNull("Database is Populated", base);
         assertNotNull("User Populated", user);
         assertNotNull("User info Populated", firstName);
     }  

}
