/**Data model of user info
Data is pulled from here for
-View.signInView
Interacts with
-Controller.IST412_Group1
*/
package ist412_group1.Model;

public class user {
    private String type;
    String firstName;
    String lastName;
    String userName;
    String password;
    int loggedIn = 0;
    
        public String login(String a, String b){
        if(a == userName && b ==password){
            loggedIn = 1;
        }
        return a;
    }
}
