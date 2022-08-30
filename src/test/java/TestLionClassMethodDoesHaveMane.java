import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestLionClassMethodDoesHaveMane {
    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
    private final Lion lion;
    private final boolean expected;

    public TestLionClassMethodDoesHaveMane(Lion lion, boolean expected) {
        this.lion = lion;
        this.expected = expected;
    }

    @Mock
    static
    Feline feline;

    @Parameterized.Parameters
    public static Object[] doesHaveMane() throws Exception {
        return new Object[][] {
                {new Lion("Самец", feline), true},
                {new Lion("Самка", feline), false},
        };
    }

    @Test
    public void testLionClassMethodDoesHaveMane() {
        assertEquals(expected, lion.doesHaveMane());
    }
}
