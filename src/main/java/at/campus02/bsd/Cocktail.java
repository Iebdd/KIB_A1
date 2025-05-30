package at.campus02.bsd;

import java.util.List;

/**
 * This class extends a drink made of multiple liquids.
 * has information about volume and alcohol percentage
 */
public class Cocktail extends Drink{

    private final List<Liquid> content;

    public Cocktail(String name, List<Liquid> content) {
        super(name);
        this.content = content;
    }

    /**
     * Calculates the total volume of the cocktail
     * @return a double for the volume of the cocktail
     */
    @Override
    public double getVolume() {
        double volume = 0;
        for(Liquid liquid : content) {
            volume += liquid.getVolume();
        }
        return volume;
    }

    /**
     * Calculates the total alcohol percentage of the cocktail
     * @return a double for the alcohol percentage
     */
    @Override
    public double getAlcoholPercent() {
        double volume = getVolume();
        double totalAlcohol = 0;
        for(Liquid liquid : content) {
            double ratio = liquid.getVolume() / volume;
            totalAlcohol += ratio * liquid.getAlcoholPercent();
        }
        return totalAlcohol;
    }

    /**
     * returns true if the drink is alcoholic
     * @return boolean
     */
    @Override
    public boolean isAlcoholic() {
        for(Liquid liquid : content) {
            if(liquid.getAlcoholPercent() != 0) {
                return false;
            }
        }
        return true;
    }

}
