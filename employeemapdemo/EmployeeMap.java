package employeemapdemo;

import java.util.HashMap;

/**
 *
 * @author alimo
 */
public class EmployeeMap 
{
    HashMap <Integer,Employee> Employeeinfo = new HashMap<>();
    
    public EmployeeMap()
    {
      Employeeinfo = new HashMap<>();
    }
    
    public void addemployee(Employee employee)
    {
       Employeeinfo.put(employee.getemployeeID(),employee);
    }
    
    public Employee getEmployeeByID(int employeeID) 
    {
       return Employeeinfo.get(employeeID);
    }
    

}


