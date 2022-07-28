package medicine;

import person.Doctor;
import person.Patient;
import prescription.Prescription;

import java.util.Objects;

public final class Case {
    int caseNum ;
    Symptoms patientSymptoms ;
    Doctor assignedDoctor;
    Patient patient;

    public Case(int caseNum, Symptoms patientSymptoms, Doctor assignedDoctor, Patient patient) {
        this.caseNum = caseNum;
        this.patientSymptoms = patientSymptoms;
        this.assignedDoctor = assignedDoctor;
        this.patient = patient;
    }



    public int getCaseNum() {
        return caseNum;
    }

    public void setCaseNum(int caseNum) {
        this.caseNum = caseNum;
    }

    public Symptoms getPatientSymptoms() {
        return patientSymptoms;
    }

    public void setPatientSymptoms(Symptoms patientSymptoms) {
        this.patientSymptoms = patientSymptoms;
    }

    public Doctor getAssignedDoctor() {
        return assignedDoctor;
    }

    public void setAssignedDoctor(Doctor assignedDoctor) {
        this.assignedDoctor = assignedDoctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Case aCase = (Case) o;
        return caseNum == aCase.caseNum && Objects.equals(patientSymptoms, aCase.patientSymptoms) && Objects.equals(assignedDoctor, aCase.assignedDoctor) && Objects.equals(patient, aCase.patient);
    }

    @Override
    public int hashCode() {
        return Objects.hash(caseNum, patientSymptoms, assignedDoctor, patient);
    }
}
