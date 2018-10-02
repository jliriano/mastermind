package JoelLiriano.Mastermind.models;

import org.junit.jupiter.api.Test;

public class ColorTest {
    @Test
    void testGetValidInputString(){
        System.out.println(Color.getValidInput());
    }

    @Test
    void testGetAllowedColorsRegex(){
        System.out.println(Color.getAllowedColorsRegEx());
    }
}
