package emergencyroomdemo;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author alimo
 */
public class Patient 
{
    private final String name;
    private final LocalDate dob;
    private Severity severity;
    private LocalTime arrivaltime;
    
    public Patient(String name, LocalDate dob) 
    {
        this.name = name;
        this.dob = dob;
    }
    
    public String getName()
    {
       return name;
    }

    public LocalDate getDob()
    {
       return dob;
    }

    public Severity getSeverity() 
    {
       return severity;
    }

    public void setSeverity(Severity severity) 
    {
       this.severity = severity;
    }

    public LocalTime getArrivaltime() 
    {
       return arrivaltime;
    }

    public void setArrivaltime(LocalTime arrivaltime) 
    {
       this.arrivaltime = arrivaltime;
    }

    @Override
    public String toString() 
    {
        return "Name: " + name + " DOB: " + dob + " Severity: " + severity + " Arrival Time: " + arrivaltime;
    }
}
