package appointments;

import medicine.Case;

public abstract class Appointments {
    static String reasonAppointment;
    static String appointedDoctor;
    static String appointmentPatient;
    static Case caseAppointment;


    public static void makeAppointment(Case caseAppointment) {
        reasonAppointment = caseAppointment.patientSymptoms;
        appointedDoctor = caseAppointment.assignedDoctor;
        appointmentPatient = caseAppointment.patientName;

        System.out.println(appointedDoctor + " Meeting " + appointmentPatient +
                " July 27");
    }

    public String getReasonAppointment() {
        return reasonAppointment;
    }

    public void setReasonAppointment(String reasonAppointment) {
        this.reasonAppointment = reasonAppointment;
    }


}
