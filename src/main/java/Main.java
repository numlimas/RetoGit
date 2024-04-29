import doctor.Doctor;
import user.User;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        Doctor doctor = new Doctor();

        user.setAge(12);
        user.setName("UsuarioNombre");

        doctor.setName("DoctorNombre");
        doctor.setAge(41);

        System.out.println("Edad usuario: "+user.getAge()+", Nombre Usuario :"+user.getName());
        System.out.println("Edad doctor: "+doctor.getAge()+", Nombre Doctor :"+doctor.getName());



    }
}
