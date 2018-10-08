import org.junit.jupiter.api.Test;
import terning.Dice;

import static org.junit.jupiter.api.Assertions.*;


class DiceTest {

    /** Test 1 - af 'roll()'
     * @author ?? Gruppe 44
     * Beskrivelse: Tester om forekomsten af terningens mulige udfald,
     *              ud fra metoden 'roll()' er fordelt forholsvist ligeligt,
     *              som det er meningen den skal være.
     * Udførselsbeskrivelse: Ved at lade metoden gennemkøre så meget som 60000 gange,
     *                      fås et rimeligt estimat, som ved almindelig sandsynlighedslogik,
     *                      bør være forholdsvist ligeligt fordelt.
     *                      En hvis afvigelse kan ikke undgås, men denne medtages i vurdering
     *                      som en naturlig tilfældig afvigelse på 400 / (~(60000/6)),
     *                      hvilket svarer til en afvigelse på cirka 4 %, hvilket bør være rigeligt
     *                      for en test med så mange gennemkørsler.
     * Forventet: Hvert udfald vil forekomme '10.000 plus-minus 400' gange.
     */
    @Test
    void testRoll(){
        // Arrange
        Dice dice = new Dice();

        //Tællere for hvert udfald i roll() metoden, defineres.
        int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0, count6 = 0;

        // Act
        // Et for loop anvendes til at gennemkøre roll() 60.000 gange.
        for(int i = 0; i < 60000; i++){
            int num = dice.roll();

            // Der testes at der kun modtages valid data fra metoden.
            assertTrue(num>0 && num < 7);

            // Et switch statement anvendes til at inkrementere tælleren for hvert vilkårligt udfald med en.
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
        // Der testes om forekomsten af hvert udfald stemmer overens med det estimerede 10.000 plus-minus 400.
        // delta: 400 illustrerer den tilladte afvigelse
        // fra det forventede resultat (expected: 10000).
        // Er counteren indenfor for denne afvigelse fra det forventedevil testen ikke finde fejl.
        assertEquals(10000, count1, 400);
        assertEquals(10000, count2, 400);
        assertEquals(10000, count3, 400);
        assertEquals(10000, count4, 400);
        assertEquals(10000, count5, 400);
        assertEquals(10000, count6, 400);
    }
}