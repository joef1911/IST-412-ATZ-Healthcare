/**Data model of employee info.
 * Data is pulled from here for
 *      -View.informationView
 *      -View.editInformationView
 *      -View.careInstructionsView
 * Interacts with
 *      -Controller.IST412_Group1
*/
package ist412_group1.Model;

public class Employee {
    private String[] records;
    String firstName;
    String lastName;
    String userName;

    /**
     * Getter for employee's record.
     * @return records
     */
    public String[] getRecords() {
        return records;
    }

    /**
     * Setter for employee's record.
     * @param records 
     */
    public void setRecords(String[] records) {
        this.records = records;
    }

    /**
     * Getter for employee's first name.
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Setter for employee's first name.
     * @param firstName 
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Getter for employee's last name
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Setter for employee's last name.
     * @param lastName 
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    /**
     * Getter for employee's user name
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Setter for employee's user name
     * @param userName 
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    
}
