package primefacesschedule.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * Event.class: POJO class of the Event module. Contains 4 attributes 
 * <b>Title</b>(String), <b>PreviousDate</b>(Date), <b>NextDate</b>(Date)and <b>AllDay</b>(boolean).
 * And also, implements <b>Serializable</b> interface.
 * @author MichkaDaCoder
 */
public class Event implements Serializable {
    private String Title;
    private Date PreviousDate;
    private Date NextDate;
    private boolean AllDay;
    
    //Default Constructor of the class.
    public Event() {
    }

    /**
     * Parameterized Constructor of the class.
     * @param Title
     * @param PreviousDate
     * @param NextDate
     * @param AllDay 
     */
    public Event(String Title, Date PreviousDate, Date NextDate, boolean AllDay) {
        this.Title = Title;
        this.PreviousDate = PreviousDate;
        this.NextDate = NextDate;
        this.AllDay=AllDay;
    }

    /**
     * Getter of the <b>Title</b> attribute
     * @return <b>Title</b>
     */
    public String getTitle() {
        return Title;
    }

    /**
     * Setter of the <b>Title</b> attribute.
     * @param Title 
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Getter of the <b>PreviousDate</b> attribute.
     * @return <b>PreviousDate</b>
     */
    public Date getPreviousDate() {
        return PreviousDate;
    }

    /**
     * Setter of the <b>PreviousDate</b> attribute.
     * @param PreviousDate 
     */
    public void setPreviousDate(Date PreviousDate) {
        this.PreviousDate = PreviousDate;
    }

    /**
     * Getter of the <b>NextDate</b> attribute.
     * @return <b>NextDate</b>
     */
    public Date getNextDate() {
        return NextDate;
    }

    /**
     * Setter of the <b>NextDate</b> attribute.
     * @param NextDate 
     */
    public void setNextDate(Date NextDate) {
        this.NextDate = NextDate;
    }

    /**
     * Getter of the <b>AllDay</b> attribute
     * @return <b>AllDay</b>
     */
    public boolean isAllDay() {
        return AllDay;
    }

    /**
     * Setter of the <b>AllDay</b> attribute.
     * @param AllDay 
     */
    public void setAllDay(boolean AllDay) {
        this.AllDay = AllDay;
    }

    /**
     * Stringify a new created <b>Event</b> object by showing its <b>Title</b> attribute.
     * @return <b>Title</b>
     */
    @Override
    public String toString() {
        return this.Title;
    }
    
    
}
