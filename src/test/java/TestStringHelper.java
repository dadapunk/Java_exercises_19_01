import org.example.StringHelper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestStringHelper {
    @Test
    public void should_Return_IlegalArgument_When_Null(){
        assertThrows(IllegalArgumentException.class, () -> new StringHelper().reverse(""));

    }
}
