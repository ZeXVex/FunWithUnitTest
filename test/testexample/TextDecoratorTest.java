/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testexample;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jeppe
 */
public class TextDecoratorTest {

    /**
     * Test of allCaps method, of class TextDecorator.
     */
    @Test
    public void testAllUpperLower() {
        testAllUpperLowerInputOutput("Az", "aZ");
        testAllUpperLowerInputOutput("za", "zA");
        testAllUpperLowerInputOutput("TeSt", "tEsT");
        testAllUpperLowerInputOutput("test", "tEsT");
        testAllUpperLowerInputOutput("TEST", "tEsT");
        testAllUpperLowerInputOutput("TESt!", "tEsT!");
    }

    public void testAllUpperLowerInputOutput(String input, String expectedOutput) {
        TextDecorator instance = new TextDecorator();
        String result = instance.allUpperLower(input);
        assertEquals(expectedOutput, result);
    }

    /**
     * Test of allLower method, of class TextDecorator.
     */
    @Test
    public void testAllLower() {
        testAllLowerInputOutput("A", "a");
        testAllLowerInputOutput("Z", "z");
        testAllLowerInputOutput("TeSt", "test");
        testAllLowerInputOutput("test", "test");
        testAllLowerInputOutput("TEST", "test");
        testAllLowerInputOutput("TESt!", "test!");
    }

    public void testAllLowerInputOutput(String input, String expectedOutput) {
        TextDecorator instance = new TextDecorator();
        String result = instance.allLower(input);
        assertEquals(expectedOutput, result);
    }

    /**
     * Test of allCaps method, of class TextDecorator.
     */
    @Test
    public void testAllCaps() {
        testAllCapsInputOutput("a", "A");
        testAllCapsInputOutput("z", "Z");
        testAllCapsInputOutput("TeSt", "TEST");
        testAllCapsInputOutput("test", "TEST");
        testAllCapsInputOutput("TEST", "TEST");
        testAllCapsInputOutput("TESt!", "TEST!");
    }

    public void testAllCapsInputOutput(String input, String expectedOutput) {
        TextDecorator instance = new TextDecorator();
        String result = instance.allCaps(input);
        assertEquals(expectedOutput, result);
    }

}
