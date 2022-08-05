package capacity;

import exceptions.ExceedCapacityException;
import exceptions.NegativeValueException;

public interface ICapacityFlow {
    void docEntry() throws ExceedCapacityException, NegativeValueException;
    void docExit() throws ExceedCapacityException, NegativeValueException;
    void visitorEntry() throws ExceedCapacityException, NegativeValueException;
    void visitorExit() throws ExceedCapacityException, NegativeValueException;

    static void patientEntry() throws ExceedCapacityException, NegativeValueException {

    }

    void patientExit() throws NegativeValueException, ExceedCapacityException;
}
