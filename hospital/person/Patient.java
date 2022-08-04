package person;

final public class Patient extends Person {
    int patientNum;

    public Patient(String fullName,int patientNum){
        super(fullName);
        this.patientNum = patientNum;

    }
    public int getPatientNum() {
        return patientNum;
    }

    public void setPatientNum(int patientNum) {
        this.patientNum = patientNum;
    }
}
