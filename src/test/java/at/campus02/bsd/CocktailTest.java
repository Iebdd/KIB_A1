package at.campus02.bsd;

import org.junit.jupiter.api.BeforeEach;

public class CocktailTest {
    Liquid vodka = new Liquid("vodka", 20, 40);
    Liquid gin = new Liquid("gin", 20, 37.5);
    Liquid rum = new Liquid("rum", 20, 37.5);
    Liquid tequila = new Liquid("tequila", 20, 40);
    Liquid curacao = new Liquid("curacao", 20, 40);
    Liquid orange_juice = new Liquid("orange juice", 200, 0);
    Liquid lemon_juice = new Liquid("lemon juice", 200, 0);
    Liquid tonic_water = new Liquid("tonic water", 200, 0);

    @BeforeEach
    void setup() {
        
    }
}
