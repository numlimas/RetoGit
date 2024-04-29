package patient;

import user.User;

public class Patient extends User {
    private String triage = "Inmediato";

    public String getTriage() {
        return triage;
    }

    public Patient(){
        super.setName("Santino");
        super.setAge(15);
        this.getTriage();
    }

}
