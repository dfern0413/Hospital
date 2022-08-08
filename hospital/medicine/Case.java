package medicine;

import java.util.logging.Logger;

public final class Case {
    int caseNum;
    public String patientSymptoms;
    public String assignedDoctor;
    public String patientName;
    public String doctorDiagnose;

    private static final Logger logger = Logger.getLogger("CaseLog");

    public Case(int caseNum, String patientSymptoms, String assignedDoctor, String patientName) {
        this.caseNum = caseNum;
        this.patientSymptoms = patientSymptoms;
        this.assignedDoctor = assignedDoctor;
        this.patientName = patientName;
        logger.info("Case Created");
    }

    public void diagnose(){
        switch (patientSymptoms) {
            case "Mild Fever":
                doctorDiagnose = "Common Cold";
                break;
            case "Pain in Shoulder":
                doctorDiagnose = "Dislocated Shoulder";
                break;
            case "Mild Skin Burn":
                doctorDiagnose = "Mild Burn";
                break;
            default:
                doctorDiagnose = "N/A";
                break;
        }
    }


}
