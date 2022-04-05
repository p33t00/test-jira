import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPete {
    @Test
    public void testIncBy2() {
        Pete p = new Pete();
        int res = p.incBy2(2);
        assertEquals(5, res);
    }
}
