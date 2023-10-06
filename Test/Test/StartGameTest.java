package Test;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StartGameTest {

    @Test
    void gameStart() {
        String gameStart = "2"; //Get input for gameStart from scanner
        if (gameStart.equals("1")) {
            gameStart = "Yes";
            System.out.println("Thank you for playing!");
        } else {
            System.out.println("Game didn't start");
            gameStart = "No";
        }
        assertEquals("No",gameStart);
    }
}