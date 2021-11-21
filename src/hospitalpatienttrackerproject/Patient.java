package hospitalpatienttrackerproject;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Hilal Demir
 */
public class Patient extends User {
    public String PatientID;
    public String TCno;
    public String Weight;
    public String Height;
    public String Admitted;
    public String  StayPeriod;
 

    public Patient(String PatientID, String TCno, String Weight, String Height,String Admitted, String Name, String Lastname,
            String Mobilenumber, String Gender,String Birthday, String Password,String StayPeriod) {
        super(Name, Lastname, Mobilenumber, Gender, Birthday, Password);
        this.PatientID = PatientID;
        this.TCno = TCno;
        this.Weight = Weight;
        this.Height = Height;
        this.Admitted = Admitted;
        this.StayPeriod= StayPeriod;
    }
    public Patient(String PatienID,String Password)
    {
        super(Password);
        this.PatientID=PatientID;
        
    }

    public String getPatientID() {
        return PatientID;
    }

    public String getTCno() {
        return TCno;
    }

    public String getWeight() {
        return Weight;
    }

    public String getHeight() {
        return Height;
    }

    public String getAdmitted() {
        return Admitted;
    }


    public void setPatientID(String PatientID) {
        this.PatientID = PatientID;
    }

    public void setTCno(String TCno) {
        this.TCno = TCno;
    }

    public void setWeight(String Weight) {
        this.Weight = Weight;
    }

    public void setHeight(String Height) {
        this.Height = Height;
    }

    public void setAdmitted(String Admitted) {
        this.Admitted = Admitted;
    }

    public String getStayPeriod() {
        return StayPeriod;
    }

    public void setStayPeriod(String StayPeriod) {
        this.StayPeriod = StayPeriod;
    }
    
    public void Login()
    {
        
    }
    public void RegisterPatient()
    {
        
    }
    public void DisplayPatientInfo()
    {
        
    }
    public void DisplayMedications()
    {
        
    }
    public void DisplayAppointments()
    {
        
    }
    public void makeAppointments()
    {
        
    }
    public void DisplayResults()
    {
        
    }
    
}