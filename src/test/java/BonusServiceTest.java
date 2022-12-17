import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;
public class BonusServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/bonus.csv")
    void TestRegisteredLimit(int expected,int amount,boolean isRegistered) {
        BonusService service = new BonusService();

        long actual = service.calculate(amount, isRegistered);

        assertEquals(expected, actual);
    }
}
