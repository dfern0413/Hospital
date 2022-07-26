package person;

import java.util.Objects;

public class Patient extends Person {
    int patientNum;
    String symptoms;
    String diagnose;

    public Patient(int age, char sex, String fullName,int patientNum, String symptoms, String diagnose){
        super(age, sex, fullName);
        this.patientNum = patientNum;
        this.symptoms = symptoms;
        this.diagnose = diagnose;

    }

    @Override
    public int hashCode() {
        return Objects.hash(patientNum, symptoms, diagnose);
    }
}
