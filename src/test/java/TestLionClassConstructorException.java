import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class TestLionClassConstructorException {
    @Mock
    Feline feline;

    @Test
    public void testLionClassСonstructorException() {
        try {
            Lion lion = new Lion("Оно", feline);
        }
        catch (Exception e) {
            assertEquals("Используйте допустимые значения пола животного - самец или самка", e.getMessage());
        }
    }
}
