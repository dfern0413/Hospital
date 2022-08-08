package capacity;

import exceptions.ExceedCapacityException;
import exceptions.NegativeValueException;

import org.apache.log4j.Logger;

public class Capacity implements ICapacityFlow{
    static int patientAmount;
    static int staffAmount;
    static int visitorAmount;
    private static final Logger LOGGER = Logger.getLogger("Personal Capacity");

    public Capacity(int visitorAmount, int staffAmount, int patientAmount){
        try {
            Capacity.visitorAmount = visitorAmount;
            Capacity.staffAmount = staffAmount;
            Capacity.patientAmount = patientAmount;
            ValidateCapacity(Capacity.patientAmount,Capacity.staffAmount, Capacity.visitorAmount);
        }catch (Exception e){
            LOGGER.fatal("Problem: " + e);
        }
    }


    public static void patientEntry() throws NegativeValueException, ExceedCapacityException {
        patientAmount++;
        Capacity.ValidateCapacity(patientAmount,staffAmount,visitorAmount);
        System.out.println(patientAmount);
    }

    public void patientExit() throws NegativeValueException, ExceedCapacityException {
        patientAmount--;
        Capacity.ValidateCapacity(patientAmount,staffAmount,visitorAmount);
        System.out.println(patientAmount);
    }
    public void visitorEntry() throws ExceedCapacityException, NegativeValueException {
        visitorAmount++;
        Capacity.ValidateCapacity(patientAmount,staffAmount,visitorAmount);
        System.out.println(visitorAmount);
    }

    public void visitorExit() throws ExceedCapacityException, NegativeValueException {
        visitorAmount--;
        Capacity.ValidateCapacity(patientAmount,staffAmount,visitorAmount);
        System.out.println(visitorAmount);
    }
    public void docEntry() throws ExceedCapacityException, NegativeValueException {
        staffAmount++;
        Capacity.ValidateCapacity(patientAmount,staffAmount,visitorAmount);
        System.out.println(staffAmount);
    }

    public void docExit() throws ExceedCapacityException, NegativeValueException {
        staffAmount--;
        Capacity.ValidateCapacity(patientAmount,staffAmount,visitorAmount);
        System.out.println(staffAmount);
    }

    public static void ValidateCapacity(int patientAmount, int staffAmount, int visitorAmount) throws ExceedCapacityException, NegativeValueException {
        if(patientAmount > 250 | staffAmount > 120 | visitorAmount > 100){
            throw new ExceedCapacityException("Patient limit is 250, Staff limit is 120, Visitor limit is 100");
        } else if (patientAmount < 0 | staffAmount < 0 | visitorAmount < 0) {
            throw new NegativeValueException("Cannot have less than 0");
        }
    }

    public int getPatientAmount() {
        return patientAmount;
    }

    public void setPatientAmount(int patientAmount) {
        this.patientAmount = patientAmount;
    }

    public int getStaffAmount() {
        return staffAmount;
    }

    public void setStaffAmount(int staffAmount) {
        this.staffAmount = staffAmount;
    }

    public int getVisitorAmount() {
        return visitorAmount;
    }

    public void setVisitorAmount(int visitorAmount) {
        this.visitorAmount = visitorAmount;
    }
}
