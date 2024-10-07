package exercises.uebung1.tests;
import static org.junit.jupiter.api.Assertions.*;
import exercises.uebung1.control.GermanTranslator;
import org.junit.jupiter.api.Test;

public class GermanTranslatorTest {
    
    @Test
    void testPositiv() {
        GermanTranslator translator = new GermanTranslator();
        
        //Rand Betrachtung
        assertEquals("eins", translator.translateNumber(1));
        assertEquals("zehn", translator.translateNumber(10));
        
        // random Mitte
        assertEquals("fünf", translator.translateNumber(5));
    }
    
    @Test
    void testNegativ() {
        GermanTranslator translator = new GermanTranslator();
        
        // Rand Betrachtung mit Null
        assertEquals("Übersetzung der Zahl 0 nicht möglich (Version: 1.0)", 
                     translator.translateNumber(0));
        
        // Rand Betrachtung > 10
        assertEquals("Übersetzung der Zahl 11 nicht möglich (Version: 1.0)", 
                     translator.translateNumber(11));
        
        // Rand Betrachutng Negativ
        assertEquals("Übersetzung der Zahl -1 nicht möglich (Version: 1.0)", 
                     translator.translateNumber(-1));
    }
}