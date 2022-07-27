package person;

public class Doctor extends Person {
    String specialty;

    public Doctor(int age, String fullName, String specialty){
        super(fullName);
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}
