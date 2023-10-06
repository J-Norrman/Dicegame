package Test;

import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.*;

class TryCatchTest {

    @Test
    void intScanner() {
        int intInput = -1; // Get value of intInput from scanner, can't test for string in user input(?)
        boolean intCheck = true;
        while(intCheck) {
            try {
                if (intInput > 0) {
                    intInput = 100;
                    System.out.println("Scanner input is legal and greater than 0");
                    break;
                } else {
                    intInput = 123;
                    System.out.println("Scanner number is legal but less or equals to 0");
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Scanner input is illegal (not an int)");
                break;
            }
        }
        assertEquals(123, intInput);
    }
}