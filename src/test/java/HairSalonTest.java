import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HairSalonTest {

    HairSalon hairSalon = new HairSalon();

    @Test
    public void testGetOpeningDays() {
        var expected  = new String[]{"Monday", "Tuesday"};
        var actual  = hairSalon.getOpeningDays();
        assertArrayEquals(expected, actual);
        
    }

    @Test
    public void testSalonIsOpenOnMonday() {
        assertTrue(hairSalon.isOpen("Monday"));
    }

    @Test
    public void testSalonIsClosedOnWednesday() {
     assertFalse(hairSalon.isOpen("Wednesday"));
    }

    @Test
    public void testExceptionIsThrownIfWeekdayDoesNotEndInDay() {
        Exception exception =assertThrows(IllegalArgumentException.class, () -> hairSalon.isOpen("SomeDay"));
        String actual = exception.getMessage();
        String expected = "only weekdays are valid";
        assertEquals(expected, actual);
        
    }

}