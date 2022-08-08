package appointments;

import medicine.Case;

import java.util.Date;
import org.apache.log4j.Logger;

public abstract class Appointments implements IAppointments{
    static String reasonAppointment;
    static String appointedDoctor;
    static String appointmentPatient;
    private static final Logger LOGGER = Logger.getLogger("Case Log");

    public static void makeAppointment() {
        reasonAppointment = Case.patientSymptoms;
        appointedDoctor = Case.assignedDoctor;
        appointmentPatient = Case.patientName;
        Date currentDate = new Date();
        LOGGER.info(appointedDoctor + " Meeting " + appointmentPatient +
                " " + currentDate);
    }

    public String getReasonAppointment() {
        return reasonAppointment;
    }

    public void setReasonAppointment(String reasonAppointment) {
        this.reasonAppointment = reasonAppointment;
    }


}
