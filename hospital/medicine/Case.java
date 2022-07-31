package medicine;

import person.Doctor;
import person.Patient;
import prescription.Prescription;

import java.util.Objects;

public class Case {
    int caseNum;
    public String patientSymptoms;
    public String assignedDoctor;
    public String patientName;
    public String doctorDiagnose;

    public Case(int caseNum, String patientSymptoms, String assignedDoctor, String patientName) {
        this.caseNum = caseNum;
        this.patientSymptoms = patientSymptoms;
        this.assignedDoctor = assignedDoctor;
        this.patientName = patientName;
    }

    public void diagnose(){
        if(patientSymptoms == "Mild Fever"){
            doctorDiagnose = "Common Cold";
        } else if (patientSymptoms == "Pain in Shoulder") {
            doctorDiagnose = "Dislocated Shoulder";
        } else if (patientSymptoms == "Mild Skin Burn") {
            doctorDiagnose = "Mild Burn";
        } else {
            doctorDiagnose = "N/A";
        }
    }


}
