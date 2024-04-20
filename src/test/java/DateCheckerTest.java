
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

class DateCheckerTest {

    DateChecker dateChecker = new DateChecker();

    @ParameterizedTest
    @EnumSource(value = DateChecker.Month.class, names = {"JANUARY", "MARCH", "MAY", "JULY", "SEPTEMBER", "NOVEMBER", "DECEMBER"})
    public void testHas31Days(DateChecker.Month month) {
        assertTrue(dateChecker.has31Days(month));
    }

    @ParameterizedTest
    @EnumSource(value = DateChecker.Month.class, names = {"FEBRUARY", "APRIL", "JUNE", "AUGUST", "OCTOBER"})
    public void testDoesNotHave31Days(DateChecker.Month month) {
        assertFalse(dateChecker.has31Days(month));
    }

}
