package emergencyroomdemo;
import java.time.LocalTime;
import java.util.Comparator;
import java.util.PriorityQueue;



/**
 *
 * @author alimo
 */
public class EmergencyRoom 
{
    private final PriorityQueue<Patient> patientQueue;

    // Constructor that takes a comparator for Patient objects
    public EmergencyRoom(Comparator<Patient> comparator)
    {
        this.patientQueue = new PriorityQueue<>(comparator);
    }

    // checkIn method
    public void checkIn(Patient patient, Severity severity)
    {
        patient.setSeverity(severity);
        patient.setArrivaltime(LocalTime.now());
        patientQueue.add(patient);
    }

    // admit method
    public Patient admit()
    {
        return patientQueue.poll(); // Retrieves and removes the head of the queue
    }
   
}
