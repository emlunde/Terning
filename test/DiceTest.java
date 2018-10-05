import org.junit.jupiter.api.Test;
import terning.Dice;

import static org.junit.jupiter.api.Assertions.*;


class DiceTest {

    @Test
    void testRoll(){
        Dice dice = new Dice();


        for(int i = 0; i < 60000; i++){
            int num = dice.roll();
            assertTrue(num>0 && num < 7);

        }

    }


}