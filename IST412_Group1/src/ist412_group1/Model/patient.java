/**Data model of patient info
Data is pulled from here for
-View.informationView
-View.editInformationView
-View.careInstructionsView
Interacts with
-Controller.IST412_Group1
*/
package ist412_group1.Model;



public class patient {
    private String[] records;
    String firstName;
    String lastName;
    
    public String getName(){
        String a = firstName + lastName;
        return a;
    }
}
