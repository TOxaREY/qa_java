import com.example.Feline;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestFelineClassMethodGetKittensWithArg {

    @Test
    public void testFelineClassMethodGetKittensWithArg() {
        Feline feline = new Feline();
        assertEquals(5, feline.getKittens(5));
    }
}
