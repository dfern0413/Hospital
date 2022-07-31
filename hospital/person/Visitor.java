package person;

import java.util.Objects;

final public class Visitor extends Person{
    String patientVisiting;


    public Visitor(String fullName, String patientVisiting) {
        super(fullName);
        this.patientVisiting = patientVisiting;
    }

    public String getPatientVisiting() {
        return patientVisiting;
    }

    public void setPatientVisiting(String patientVisiting) {
        this.patientVisiting = patientVisiting;
    }
}
