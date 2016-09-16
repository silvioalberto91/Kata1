/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata1v2;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author usuario
 */
public class Person {
    private final String name;
    private final Calendar birthday;
    private final long MILLISECONDPORYEAR = (365 * 24 * 60 * 60 * 1000);

    public Person(String name, Calendar birthday) {
        this.name = name;
        this.birthday = birthday;
    }
    

    public String getName() {
        return name;
    }

    public Calendar getBirthday() {
        return birthday;
    }
    public int getAge(){
    Calendar today;
    today = GregorianCalendar.getInstance();
    return (int)( today.getTimeInMillis() - birthday.getTimeInMillis() );
    
}
    private long milliSecondToYear (long milles){
        return milles / MILLISECONDPORYEAR;
    }
    
}
