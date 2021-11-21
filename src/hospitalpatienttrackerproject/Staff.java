
package hospitalpatienttrackerproject;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Hilal Demir
 */
public class Staff extends User {
    public String StaffID;

    public Staff(String StaffID, String Name, String Lastname, String Mobilenumber, String Gender,String Birthday, String Password) {
        super(Name, Lastname, Mobilenumber, Gender, Birthday, Password);
        this.StaffID = StaffID;
    }
    public Staff(String StaffID,String Password)
    {
        super(Password);
        this.StaffID=StaffID;
    }

    public String getStaffID() {
        return StaffID;
    }

    public void setStaffID(String StaffID) {
        this.StaffID = StaffID;
    }
    public void StaffDiff(String StaffID)
    {
        String str = StaffID;
        char[] ch = str.toCharArray();
        if(ch[1]==1)
        {
            Doctor doc=new Doctor(StaffID,Name,Lastname,Mobilenumber,Gender,Birthday,Password);
            new DoctorView().setVisible(true);
        }
        else if(ch[1]==2)
        {
            Nurse nur=new Nurse(StaffID,Name,Lastname,Mobilenumber,Gender,Birthday,Password);
            new NurseView().setVisible(true);
        }
        else if(ch[1]==3)
        {
            LabTechnician labtec=new LabTechnician(StaffID,Name,Lastname,Mobilenumber,Gender,Birthday,Password);
            new LabTecView().setVisible(true);
        }
        else if(ch[1]==4)
        {
            Pharmacist pha=new Pharmacist(StaffID,Name,Lastname,Mobilenumber,Gender,Birthday,Password);
            new PharmacistView().setVisible(true);
        }
        else if(ch[1]==5)
        {
            Secretary pha=new Secretary(StaffID,Name,Lastname,Mobilenumber,Gender,Birthday,Password);
            new SecView().setVisible(true);
        }
    }
    
}
