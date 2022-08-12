package appointments;

import generics.list;
import medicine.Case;

import java.util.Date;
import org.apache.log4j.Logger;

public abstract class Appointments implements IAppointments{
    static String reasonAppointment;
    static String appointedDoctor;
    static String patientName;
    private static final Logger LOGGER = Logger.getLogger("Case Log");

    static list<String> patientList = new list<>();

    public static void makeAppointment(String patientName, String reasonAppointment, Case case1) {
        Appointments.reasonAppointment = reasonAppointment;
        Appointments.patientName = patientName;
        patientList.add(patientName);
        Date currentDate = new Date();
        LOGGER.info(appointedDoctor + " Meeting " +
                " " + currentDate);
    }

    public String getReasonAppointment() {
        return reasonAppointment;
    }

    public void setReasonAppointment(String reasonAppointment) {
        this.reasonAppointment = reasonAppointment;
    }


}
