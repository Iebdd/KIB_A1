package at.campus02.bsd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SimpleDrinkTest {

    @Test
    public void testGetVolume() {
        Liquid water = new Liquid("Water", 0.5, 0.0);
        SimpleDrink drink = new SimpleDrink("Water Drink", water);
        assertEquals(0.5, drink.getVolume(), 0.0001);
    }

    @Test
    public void testGetAlcoholPercent_NonAlcoholic() {
        Liquid juice = new Liquid("Juice", 0.3, 0.0);
        SimpleDrink drink = new SimpleDrink("Juice Drink", juice);
        assertEquals(0.0, drink.getAlcoholPercent(), 0.0001);
    }

    @Test
    public void testGetAlcoholPercent_Alcoholic() {
        Liquid vodka = new Liquid("Vodka", 0.2, 40.0);
        SimpleDrink drink = new SimpleDrink("Vodka Shot", vodka);
        assertEquals(40.0, drink.getAlcoholPercent(), 0.0001);
    }

    @Test
    public void testIsAlcoholic_True() {
        Liquid whiskey = new Liquid("Whiskey", 0.05, 45.0);
        SimpleDrink drink = new SimpleDrink("Whiskey Shot", whiskey);
        assertTrue(drink.isAlcoholic());
    }

    @Test
    public void testIsAlcoholic_False() {
        Liquid milk = new Liquid("Milk", 0.3, 0.0);
        SimpleDrink drink = new SimpleDrink("Milk Drink", milk);
        assertFalse(drink.isAlcoholic());
    }
}
