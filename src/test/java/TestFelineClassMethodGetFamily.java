import com.example.Feline;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestFelineClassMethodGetFamily {

    @Test
    public void testCatClassMethodGetFamily() {
        Feline feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily());
    }
}
