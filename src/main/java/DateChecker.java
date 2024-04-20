import java.util.Arrays;

public class DateChecker {

    enum Month {
        JANUARY(true),
        FEBRUARY(false),
        MARCH(true),
        APRIL(false),
        MAY(true),
        JUNE(false),
        JULY(true),
        AUGUST(false),
        SEPTEMBER(true),
        OCTOBER(false),
        NOVEMBER(true),
        DECEMBER(true);
        
        private final boolean has31Days;
        private Month(boolean has31Days){
        this.has31Days = has31Days;
        }
    }

    public boolean has31Days(Month month) {
        return month.has31Days;
    }

    


}
