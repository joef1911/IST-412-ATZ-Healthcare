/**Data model of employee info.
 * Data is pulled from here for
 *      -View.informationView
 *      -View.editInformationView
 *      -View.careInstructionsView
 * Interacts with
 *      -Controller.IST412_Group1
*/
package ist412_group1.Model;

public class permission
{

    private int userID;
    private String userName;
    private String role;
    private String password;

    public permission()
    {

    }

    public String getRole()
    {
        return role;
    }

    public void setRole(String role)
    {
        this.role = role;
    }
}
