package pair.programming.GW2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Cashier extends Person {

    public Cashier(){

    }
    private final DateFormat timeFormatter = new SimpleDateFormat("HHmm");
    private LocalTime startOfShift;
    private LocalTime endOfShift;

    public Cashier(String cashierName, LocalTime startOfShift, LocalTime endOfShift){
        name = cashierName;
        this.startOfShift = startOfShift;
        this.endOfShift = endOfShift;
    }


    public String getStartOfShift() {
        return startOfShift.format(DateTimeFormatter.ofPattern("HH:mm"));
    }

    public void setStartOfShift(LocalTime startOfShift) {
        this.startOfShift = startOfShift;
    }

    public String getEndOfShift() {
        return endOfShift.format(DateTimeFormatter.ofPattern("HH:mm"));
    }

    public void setEndOfShift(LocalTime endOfShift) {
        this.endOfShift = endOfShift;
    }
}
