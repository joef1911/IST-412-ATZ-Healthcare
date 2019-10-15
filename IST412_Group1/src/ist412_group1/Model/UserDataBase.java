package ist412_group1.Model;

import java.util.ArrayList;
import ist412_group1.Model.User;
/**
 *
 * @author Dalton
 */
public class UserDataBase {
    ArrayList<User> database = new ArrayList<User>();
   
    public UserDataBase(){
         User a = new User("Dalt", "Syd", "dsyd", "abc123");
         User b = new User("Rit", "Dice", "rDice", "abc567");
         User c = new User("Dan", "Smith", "dSmith", "qwe123");
         User d = new User("Rod", "Stew", "rStew", "rStew");
         database.add(a);
         database.add(b);
         database.add(c);
         database.add(d);
    }
    
    public ArrayList<User> getDataBase(){
        return database;
    }
    
    public void authenticate(User a){
        a.loggedIn = 0;
        System.out.println("Authenticating");
        for(int i = 0; i < database.size(); i++){
            if(a.getUserName().equals(database.get(i).getUserName()) && a.getPassword().equals(database.get(i).getPassword())){
                        a.loggedIn = 1;
                        System.out.println("Pass");
            }
            else{
                a.loggedIn = 0;
                System.out.println("Fail");
            }
        }

    }
}
