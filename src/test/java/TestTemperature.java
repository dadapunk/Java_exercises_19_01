import org.example.TemperatureHelper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestTemperature {

    @Test
    public void should_Return_Celcius(){
        assertEquals(37, new TemperatureHelper().FahrenheitToCelsius(98.6));
    }
    @Test
    public void should_Return_IlegalArgument_When_Zero(){
        assertThrows(IllegalArgumentException.class, () -> new TemperatureHelper().FahrenheitToCelsius(0));

    }

    }
