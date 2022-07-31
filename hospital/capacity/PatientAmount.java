package capacity;

public class PatientAmount implements capacityFlow {
    int patientAmount;

    public PatientAmount(int patientAmount){
        this.patientAmount = patientAmount;
    }

    public void entry() {
        patientAmount++;
        System.out.println(patientAmount);
    }

    public void exit() {
        patientAmount--;
        System.out.println(patientAmount);
    }

    public int getPatientAmount() {
        return patientAmount;
    }

    public void setPatientAmount(int patientAmount) {
        this.patientAmount = patientAmount;
    }
}
