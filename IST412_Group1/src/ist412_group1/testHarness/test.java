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
/**
 *
 * @author Dalton
 */


public class test {
        private static UserDataBase base = new UserDataBase();
    

        
    
    
    
     public static void main(String[] args) {  
         testDataBase();
    }
     
     public test(){
         testDataBase();
     }
     
     private static void testDataBase(){
         if(base != null){
             System.out.println("Database is Populated");
                if(base.getDataBase().get(1).getFirstName() != null){
                    System.out.println("User Populated");
                }
                else{
                    System.out.println("User Did not Populate");
                }
         }
         else{
             System.out.println("Database not populated");
         }
     }  

}
