package at.campus02.bsd;

import static org.junit.jupiter.api.Assertions.assertEquals;
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

    @DisplayName("Creating Long Island Ice Tea")
    @Test
    void testGinTonic() {
        this.content.addAll(Arrays.asList(this.gin, this.gin, this.tonic_water));
        Cocktail gin_tonic = new Cocktail("Gin Tonic", this.content);
        assertEquals(240, gin_tonic.getVolume(), DELTA);
        assertEquals(6.25, gin_tonic.getAlcoholPercent(), DELTA);
        assertTrue(gin_tonic.isAlcoholic());
        assertEquals("Gin Tonic", gin_tonic.getName());
    }
}
