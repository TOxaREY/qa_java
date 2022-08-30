import com.example.Feline;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestFelineClassMethodGetKittensWithoutArg {

    @Test
    public void testFelineClassMethodGetKittensWithoutArg() {
        Feline feline = new Feline();
        assertEquals(1, feline.getKittens());
    }
}
