
package hospitalpatienttrackerproject;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Hilal Demir
 */
public class Secretary extends Staff{

    public Secretary(String StaffID, String Name, String Lastname, String Mobilenumber, String Gender,String Birthday,String Password) {
        super(StaffID, Name, Lastname, Mobilenumber, Gender, Birthday, Password);
    }

    public Secretary(String StaffID, String Password) {
        super(StaffID, Password);
    }
    
}
