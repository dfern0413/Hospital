package supplies;

import exceptions.NegativeValueException;

public interface ISupplyUsage {
    void syringeUsed() throws NegativeValueException;

    void bandageUsed() throws NegativeValueException;

    void glovesUsed() throws NegativeValueException;

    void syringeAdded() throws NegativeValueException;

    void bandageAdded() throws NegativeValueException;

    void glovesAdded() throws NegativeValueException;
}
