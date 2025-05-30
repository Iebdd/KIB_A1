package at.campus02.bsd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CocktailTest {
    Liquid vodka = new Liquid("vodka", 20, 40);
    Liquid gin = new Liquid("gin", 20, 37.5);
    Liquid rum = new Liquid("rum", 20, 37.5);
    Liquid tequila = new Liquid("tequila", 20, 40);
    Liquid curacao = new Liquid("curacao", 20, 40);
    Liquid lemon_juice = new Liquid("lemon juice", 30, 0);
    Liquid lime_juice = new Liquid("lime juice", 30, 0);
    Liquid tonic_water = new Liquid("tonic water", 200, 0);
    Liquid cola = new Liquid("cola", 30, 0);

    private Cocktail cocktail;
    private List<Liquid> content;
    private static final double DELTA = 1e-10;

    @BeforeEach
    void setup() {
        this.content = new ArrayList<>();
    }

    @DisplayName("Creating Long Island Ice Tea")
    @Test
    void testLIIT() {
        this.content.addAll(Arrays.asList(this.vodka, this.gin, this.rum, this.tequila, this.curacao, this.lemon_juice, this.cola));
        Cocktail LIIT = new Cocktail("Long Island Ice Tea", this.content);
        assertEquals(160, LIIT.getVolume(), DELTA);
        assertEquals(24.375, LIIT.getAlcoholPercent(), DELTA);
        assertTrue(LIIT.isAlcoholic());
        assertEquals("Long Island Ice Tea", LIIT.getName());
    }

    @DisplayName("Creating Gin Tonic")
    @Test
    void testGinTonic() {
        if("gin".equals(this.gin.getName())) {
            
        }
        this.gin.setVolume(40);
        
        this.content.addAll(Arrays.asList(this.gin, this.tonic_water));
        Cocktail gin_tonic = new Cocktail("Gin Tonic", this.content);
        assertEquals(240, gin_tonic.getVolume(), DELTA);
        assertEquals(6.25, gin_tonic.getAlcoholPercent(), DELTA);
        assertTrue(gin_tonic.isAlcoholic());
        assertEquals("Gin Tonic", gin_tonic.getName());
    }

    @DisplayName("Creating Virgin Tonic")
    @Test
    void testVirginTonic() {
        this.content.addAll(Arrays.asList(this.lime_juice, this.tonic_water));
        Cocktail virgin_tonic = new Cocktail("Virgin Gin Tonic", this.content);
        virgin_tonic.setName("Virgin Tonic");
        assertEquals(230, virgin_tonic.getVolume(), DELTA);
        assertEquals(0, virgin_tonic.getAlcoholPercent(), DELTA);
        assertFalse(virgin_tonic.isAlcoholic());
        assertEquals("Virgin Tonic", virgin_tonic.getName());
    }
}
