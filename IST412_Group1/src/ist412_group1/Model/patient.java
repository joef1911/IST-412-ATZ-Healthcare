/**Data model of patient info.
 * Data is pulled from here for
 *      -View.informationView
 *      -View.editInformationView
 *      -View.careInstructionsView
 * Interacts with
 *      -Controller.IST412_Group1
*/
package ist412_group1.Model;

public class patient {
    private String[] records;
    String firstName;
    String lastName;

    /**
     * Getter for patient's record.
     * @return records
     */
    public String[] getRecords() {
        return records;
    }

    /**
     * Setter for patient's record.
     * @param records 
     */
    public void setRecords(String[] records) {
        this.records = records;
    }

    /**
     * Getter for patient's first name.
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Setter for patient's first name.
     * @param firstName 
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Getter for patient's last name
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Setter for patient's last name.
     * @param lastName 
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    
}
