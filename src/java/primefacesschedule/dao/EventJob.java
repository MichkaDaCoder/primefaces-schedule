package primefacesschedule.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import primefacesschedule.pojo.Event;

/**
 * EventJob.java : Contains a List method for Events. Implements <b> IEventDAO</b> and <b> Serializable.</b>
 * <b>IEventDAO</b> and <b>Serializable</b>.
 * @author MichkaDaCoder
 */
public class EventJob implements IEventDAO, Serializable {

    /**
     * Initializes a new List of Dummy Events
     * @return <b>List of Somes Events</b>
     */
    @Override
    public List<Event> ListEvents() {
        List<Event> l = new ArrayList<>();
        l.add(new Event("Visiting Grandma", new Date(), new Date(), true));
        l.add(new Event("Going to the Swimming pool", chooseDate(10, 7, 2018, 10), chooseDate(10, 7, 2018, 12), false));
        l.add(new Event("Meeting John Doe", chooseDate(15, 7, 2018, 15), chooseDate(15, 7, 2018, 20), false));
        l.add(new Event("Watching The Muppet Show", chooseDate(20, 7, 2018, 20), chooseDate(20, 7, 2018, 21), false));
        l.add(new Event("Event Example", new Date(), new Date(), false));
        return l;
    }

    /**
     * Function to choose a date to the Event.
     * @param day
     * @param month
     * @param year
     * @param hour
     * @return <b>Date</b>
     */
    private Date chooseDate(int day, int month, int year, int hour) {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.AM_PM, Calendar.AM);
        c.set(Calendar.DAY_OF_MONTH, day);
        c.set(Calendar.MONTH, month);
        c.set(Calendar.YEAR, year);
        c.set(Calendar.HOUR, hour);
        c.set(Calendar.MINUTE, 10);
        //c.set(year, month,day,hour,0);
      
        return c.getTime();
    }
}
