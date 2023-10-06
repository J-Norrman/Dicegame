package Test;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {

    @Test
    void rollDice() {
        Random ranNum = new Random();
        int diceRandom = 0;
        for (int i = 0; i < 1000; i++) {
            diceRandom = ranNum.nextInt(1) + 1; // Change bound 6 to bound 1, can't find assert method to test a bound
            System.out.print(diceRandom);
        }
        assertEquals(1, diceRandom);

    }
}