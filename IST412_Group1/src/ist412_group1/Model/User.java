/**
 * Data model of user info
 * Data is pulled from here for
 *      -View.signInView
 * Interacts with
 *      -Controller.IST412_Group1
*/
package ist412_group1.Model;

public class User {
    private String type;
    String firstName;
    String lastName;
    String userName;
    String password;
    int patientLink;
    int loggedIn = 0;
    int permLvl; //level 0 is typical user, level 1 is Doctors
    
    /**
     * This is the method that enables user to log in.
     * @param a the username
     * @param b the password
     * @return a - username
     */
    public User(String a, String b, String c, String d, int e, int f){
        firstName = a;
        lastName = b;
        userName = c;
        password = d;
        patientLink = e;
        permLvl = f;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public String getUserName(){
        return userName;
    }
    
    public String getPassword(){
        return password;
    }
    
    public int getLoggedIn(){
        return this.loggedIn;
    }
    
    public String login(String a, String b){
        if(a == userName && b ==password){
            loggedIn = 1;
        }
        return a;
    }
    
    public int checkPerm(){
        return permLvl;
    }
    
    
    //Doctors specialized behaviors, based on permLvl 1   
    private void addBloodTestResult(int patientID){
        
    }
    
    private void addCTScanResult(int PatientID){
        
    }
    
    private void addUrinalysisResult(int PatientID){
        
    }
    
//    //Specified doctor's behavior according to type.
//    public void doSpecializedBehavior(int patientID){
//        if(type == 1){
//            addBloodTestResult(patientID);
//        } else if (type == 2){
//            addCTScanResult(patientID);
//        } else if(type == 3){
//            addUrinalysisResult(patientID);
//        }
//    }
}
