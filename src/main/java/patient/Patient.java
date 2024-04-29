package patient;

import user.User;

public class Patient extends User {
    private String triague = "Inmediato";

    public String getTriangue() {
        return triague;
    }

    public Patient(){
        super.setName("Santino");
        super.setAge(15);
        this.getTriangue();
    }

}
