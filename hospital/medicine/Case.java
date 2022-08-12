package medicine;

import appointments.Appointments;
import exceptions.InvalidNameException;
import org.apache.log4j.Logger;

public final class Case {
    int caseNum;
    public static String patientSymptoms;
    public static String assignedDoctor;
    public static String patientName;
    public String doctorDiagnose;

    private static final Logger LOGGER = Logger.getLogger("Case Log");

    public Case(int caseNum, String patientSymptoms, String assignedDoctor, String patientName) {
        try {
            this.caseNum = caseNum;
            Case.patientSymptoms = patientSymptoms;
            Case.assignedDoctor = assignedDoctor;
            Case.patientName = patientName;
            validateCase();
        }catch (Exception e){
            LOGGER.fatal(e);
        }
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

    public void validateCase() throws InvalidNameException{
        if((Case.patientName == null || Case.patientName.equals("")) | (
                Case.assignedDoctor == null || Case.assignedDoctor.equals("")
                )){
            throw new InvalidNameException("Names Cannot be blank");
        }
    }


}
