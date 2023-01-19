import org.example.ShapeType;
import org.junit.jupiter.api.Test;
import org.example.CalculateArea;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestCalculateArea {

    @Test
    void testRuntimeException() {
        assertThrows(RuntimeException.class,()-> CalculateArea.calculateArea(ShapeType.CIRCLE));
    }
    @Test
    void shouldThrowsErrorIf_Rectangle_ParametersAreWrong(){
        assertThrows(RuntimeException.class,()-> CalculateArea.calculateArea(ShapeType.RECTANGLE,23, 56, 60));
    }

}
