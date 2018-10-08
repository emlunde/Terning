import org.junit.jupiter.api.Test;
import terning.Dice;

import static org.junit.jupiter.api.Assertions.*;


class DiceTest {

    @Test
    void testRoll(){
        // Arrange
        Dice dice = new Dice();
//LOL Simon was here
        int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0, count6 = 0;

        //Act
        for(int i = 0; i < 60000; i++){
            int num = dice.roll();
            assertTrue(num>0 && num < 7);

            switch (num){
                case 1:
                    count1++;
                    break;
                case 2:
                    count2++;
                    break;
                case 3:
                    count3++;
                    break;
                case 4:
                    count4++;
                    break;
                case 5:
                    count5++;
                    break;
                case 6:
                    count6++;
                    break;
            }
        }

       // Assert
        assertEquals(10000, count1, 400);
        assertEquals(10000, count2, 400);
        assertEquals(10000, count3, 400);
        assertEquals(10000, count4, 400);
        assertEquals(10000, count5, 400);
        assertEquals(10000, count6, 400);
    }
}