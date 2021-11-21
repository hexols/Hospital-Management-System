package hospitalpatienttrackerproject;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Hilal Demir
 */
public abstract class User {
    public String Name;
    public String Lastname;
    public String Mobilenumber;
    public String Gender;
    public String Birthday;
    public String Password;

    public User(String Password)
    {
        this.Password=Password;
    }
    public User(String Name, String Lastname, String Mobilenumber, String Gender,String Birthday, String Password) {
        this.Name = Name;
        this.Lastname = Lastname;
        this.Mobilenumber = Mobilenumber;
        this.Gender = Gender;
        this.Birthday = Birthday;
        this.Password = Password;
    }


    
    public String getName() {
        return Name;
    }

    public String getLastname() {
        return Lastname;
    }

    public String getMobilenumber() {
        return Mobilenumber;
    }

    public String getGender() {
        return Gender;
    }

    public String getBirthday() {
        return Birthday;
    }

    public String getPassword() {
        return Password;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setLastname(String Lastname) {
        this.Lastname = Lastname;
    }

    public void setMobilenumber(String Mobilenumber) {
        this.Mobilenumber = Mobilenumber;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public void setBirthday(String Birthday) {
        this.Birthday = Birthday;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    
}
