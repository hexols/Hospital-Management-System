
package hospitalpatienttrackerproject;

import java.time.LocalDate;

/**
 *
 * @author Hilal Demir
 */
public class Doctor extends Staff{

    public Doctor(String StaffID, String Name, String Lastname, String Mobilenumber, String Gender,String Birthday, String Password) {
        super(StaffID, Name, Lastname, Mobilenumber, Gender, Birthday, Password);
    }

    public Doctor(String StaffID, String Password) {
        super(StaffID, Password);
    }

}
