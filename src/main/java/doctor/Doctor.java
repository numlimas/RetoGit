package doctor;

import user.User;
import variables.VarStatic;

public class Doctor extends User {
    private String speciality = "Especialidad";

    public String getSpeciality() {
        int numero =VarStatic.variable+1;
        return speciality;
    }

    public void setSpeciality() {
        this.speciality = speciality;
    }

    public Doctor(){
        super.setAge(12);
        this.setSpeciality();
    }


}