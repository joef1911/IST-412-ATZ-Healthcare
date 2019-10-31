package ist412_group1.Model;

import ist412_group1.Controller.IST412_Group1;
import java.util.ArrayList;
import ist412_group1.Model.User;
/**
 *
 * @author Dalton
 */
public class UserDataBase {
    IST412_Group1 main;
    ArrayList<User> database = new ArrayList<User>();
    public UserDataBase(IST412_Group1 control){
        main = control;
         User a = new User("Dalt", "Syd", "dsyd", "abc123", 1);
         User b = new User("Rit", "Dice", "rDice", "abc567", 2);
         User c = new User("Dan", "Smith", "dSmith", "qwe123", 1);
         User d = new User("Rod", "Stew", "rStew", "rStew", 2);
         database.add(a);
         database.add(b);
         database.add(c);
         database.add(d);
    }
    
    public ArrayList<User> getDataBase(){
        return database;
    }
    
    public void authenticate(String a, String b) throws Exception{
        System.out.println("Authenticating");
        for(int i = 0; i < database.size(); i++){
            if(a.equals(database.get(i).getUserName()) && b.equals(database.get(i).getPassword())){
                        database.get(i).loggedIn = 1;
                        System.out.println("Pass");
                        main.setLoggedIn();
                        main.proceedToInformation();
            }
            else{
                System.out.println(database.get(i).getUserName() + a);
                System.out.println(database.get(i).getPassword() + b);
                System.out.println("Fail");
            }
        }

    }
    
    public void fullLogout(){
         for(int i = 0; i < database.size(); i++){
             database.get(i).loggedIn = 0;
         }
    }
}
