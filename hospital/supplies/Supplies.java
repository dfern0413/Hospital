package supplies;


import exceptions.NegativeValueException;

import org.apache.log4j.Logger;

public class Supplies implements ISupplyUsage {
    static int bandages = 150;
    static int syringes = 100;
    static int gloves = 250;
    private static final Logger logger = Logger.getLogger("Supplies Log");


    public static void showInventory(){
        System.out.println("Bandages: " + bandages +" Syringes: " + syringes +
                " Gloves: " + gloves);
    }

    public static void ValidateSupplies() throws NegativeValueException {
        if(bandages < 10 | syringes < 10 | gloves < 10){
            logger.info("Supplies Running Low");
            if (bandages < 0 | syringes < 0 | gloves < 0) {
                throw new NegativeValueException("Supplies Cannot be negative");
            }
        }
    }

    public void syringeUsed() throws NegativeValueException {
        syringes--;
        Supplies.ValidateSupplies();
    }

    public void syringeAdded() throws NegativeValueException{
        syringes++;
        Supplies.ValidateSupplies();
    }

    public void bandageUsed() throws NegativeValueException{
        bandages--;
        Supplies.ValidateSupplies() ;
    }

    public void bandageAdded() throws NegativeValueException{
        bandages++;
        Supplies.ValidateSupplies();
    }

    public void glovesUsed() throws NegativeValueException{
        gloves--;
        Supplies.ValidateSupplies();
    }

    public void glovesAdded() throws NegativeValueException{
        gloves++;
        Supplies.ValidateSupplies();
    }

    public static int getBandages() {
        return bandages;
    }

    public static void setBandages(int bandages) {
        Supplies.bandages = bandages;
    }

    public static int getSyringes() {
        return syringes;
    }

    public static void setSyringes(int syringes) {
        Supplies.syringes = syringes;
    }

    public static int getGloves() {
        return gloves;
    }

    public static void setGloves(int gloves) {
        Supplies.gloves = gloves;
    }
}
