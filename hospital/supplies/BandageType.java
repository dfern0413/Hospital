package supplies;

import java.util.Objects;

public class BandageType extends Supplies{
    String bandageType;
    int thickness;

    public BandageType(int bandages, int syringes, String bandageType, int thickness){
        super(bandages, syringes);
        this.bandageType = bandageType;
        this.thickness = thickness;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bandageType, thickness);
    }
}
