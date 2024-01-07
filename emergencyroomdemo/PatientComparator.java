
package emergencyroomdemo;

import java.util.Comparator;
/**
 *
 * @author alimo
 */
public class PatientComparator implements Comparator<Patient> 
{
    public int compare(Patient p1, Patient p2) 
    {
        int compareSeverity = p2.getSeverity().compareTo(p1.getSeverity());
        if (compareSeverity != 0) 
        {
            return compareSeverity;
        }
        int compareAge = p1.getDob().compareTo(p2.getDob());
        
        if (compareAge != 0)
        {
            return compareAge;
        }
        return p1.getArrivaltime().compareTo(p2.getArrivaltime());
    }
}
