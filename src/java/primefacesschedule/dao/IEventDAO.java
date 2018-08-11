package primefacesschedule.dao;

import java.util.List;
import primefacesschedule.pojo.Event;

/**
 * IEventDAO: interface that contains method for Listing Events. Implemented by <b>EventJob</b> class.
 * @author MichkaDaCoder
 */
public interface IEventDAO {
    /**
     * Returns a List of created Dummy events.
     * @return <b>List-of-Events</b>
     */
    List<Event> ListEvents();
}
