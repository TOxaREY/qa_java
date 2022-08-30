import com.example.Cat;
import com.example.Feline;
import com.example.Lion;
import com.example.Predator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class TestCatClassMethodGetFood {
    @Mock
    Feline feline;

    @Test
    public void testCatClassMethodGetFood() throws Exception {
        Cat cat = new Cat(feline);
        Mockito.when(cat.getFood()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals(List.of("Животные", "Птицы", "Рыба"), cat.getFood());
    }

    @Test
    public void testCatClassMethodGetFoodException() {
        try {
            Cat cat = new Cat(feline);
            Mockito.when(cat.getFood()).thenThrow(new Exception("Неизвестный вид животного, используйте значение Травоядное или Хищник"));
        }
        catch (Exception e) {
            assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", e.getMessage());
        }
    }
}
