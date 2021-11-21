/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalpatienttrackerproject;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Hilal Demir
 */
public class LabTechnician extends Staff {

    public LabTechnician(String StaffID, String Name, String Lastname, String Mobilenumber, String Gender,String Birthday,String Password) {
        super(StaffID, Name, Lastname, Mobilenumber, Gender, Birthday, Password);
    }

    public LabTechnician(String StaffID, String Password) {
        super(StaffID, Password);
    }
    
}