package at.campus02.bsd;

/**
 * This class describes a liquid
 * includes volume and alcohol precentage
 */
public class Liquid {

    private String name;

    // volume in l
    private double volume;

    // alcohohl percent (eg 42 )
    private double alcoholPercent;

    /**
     * Liquid constructure adds all needed params to the object
     * @param name the name of the liquid
     * @param volume how much of that liquid is given
     * @param alcoholPercent alcohol precentage in the liquid
     */
    public Liquid(String name, double volume, double alcoholPercent) {
        this.name = name;
        this.volume = volume;
        this.alcoholPercent = alcoholPercent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getAlcoholPercent() {
        return alcoholPercent;
    }
 
    public void setAlcoholPercent(double alcoholPercent) {
        this.alcoholPercent = alcoholPercent;
    }
}
