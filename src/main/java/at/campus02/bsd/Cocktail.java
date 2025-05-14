package at.campus02.bsd;

import java.util.List;

public class Cocktail extends Drink{

    private final List<Liquid> content;

    public Cocktail(String name, List<Liquid> content) {
        super(name);
        this.content = content;
    }

    @Override
    public double getVolume() {
        double volume = 0;
        for(Liquid liquid : content) {
            volume += liquid.getVolume();
        }
        return volume;
    }

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
