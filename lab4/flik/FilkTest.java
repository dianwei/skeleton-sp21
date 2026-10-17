package flik;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FilkTest {
   @Test
    public void testIsSameNumber() {
         Integer a = 1000;
         Integer b = 1000;
         assertFalse(Flik.isSameNumber(a, b));
    
         Integer c = 100;
         Integer d = 100;
         assertTrue(Flik.isSameNumber(c, d));
    
         Integer e = 127;
         Integer f = 127;
         assertTrue(Flik.isSameNumber(e, f));
    } 
}
