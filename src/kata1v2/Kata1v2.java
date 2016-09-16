package kata1v2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Kata1v2 {
    

    public static void main(String[] args) {
        Calendar date;
    date = GregorianCalendar.getInstance();
    date.set(1991,5,3);
    Person io = new Person ("Silvio", date);
    System.out.println(io.getName() + "tiene" + io.getAge());
    }
}
