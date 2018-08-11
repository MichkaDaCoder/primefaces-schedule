package primefacesschedule.controller;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import org.primefaces.model.DefaultScheduleEvent;
import org.primefaces.model.DefaultScheduleModel;
import org.primefaces.model.ScheduleEvent;
import org.primefaces.model.ScheduleModel;
import primefacesschedule.dao.EventJob;
import primefacesschedule.dao.IEventDAO;
import primefacesschedule.pojo.Event;

/**
 * EventController.java: backing-bean or the Controller for the class Event
 * @author MichkaDaCoder
 */
public class EventController implements Serializable {

    Event event = new Event();
    IEventDAO iEventDAO = new EventJob();

    private ScheduleModel eventModel;
    private ScheduleEvent scheduleEvent = new DefaultScheduleEvent();

    /**
     * Default constructor of the class.
     */
    public EventController() {
    }

    /**
     * Getter of <b>event</b> object.
     * @return <b>Event object</b>
     */
    public Event getEvent() {
        return event;
    }

    /**
     * Setter of the <b>event</b> object.
     * @param event 
     */
    public void setEvent(Event event) {
        this.event = event;
    }

    /**
     * Getter of the <b>iEventDAO</b> object
     * @return <b>iEventDAO</b>
     */
    public IEventDAO getiEventDAO() {
        return iEventDAO;
    }

    /**
     * Setter of the <b>iEventDAO</b> object
     * @param iEventDAO 
     */
    public void setiEventDAO(IEventDAO iEventDAO) {
        this.iEventDAO = iEventDAO;
    }

    /**
     * Getter of the <b>eventModel</b> object.
     * @return <b>eventModel</b>
     */
    public ScheduleModel getEventModel() {
        return eventModel;
    }

    /**
     * Setter of the <b>eventModel</b> object.
     * @param eventModel 
     */
    public void setEventModel(ScheduleModel eventModel) {
        this.eventModel = eventModel;
    }

    /**
     * Getter of the <b>scheduleEvent</b> object.
     * @return 
     */
    public ScheduleEvent getScheduleEvent() {
        return scheduleEvent;
    }

    /**
     * Setter of the <b>scheduleEvent</b> object.
     * @param scheduleEvent 
     */
    public void setScheduleEvent(ScheduleEvent scheduleEvent) {
        this.scheduleEvent = scheduleEvent;
    }

    /**
     * Initializes the PrimeFaces's Schedule Component with the list of the events we 
     * created in <b>EventJob</b> class.
     */
    @PostConstruct
    public void init() {
        eventModel = new DefaultScheduleModel();
        for (Event ev : this.getiEventDAO().ListEvents()) {
            eventModel.addEvent(new DefaultScheduleEvent(ev.getTitle(), ev.getPreviousDate(), ev.getNextDate(), ev.isAllDay()));
        }
    }

}
