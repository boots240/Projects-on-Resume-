package employeemapdemo;

import java.util.HashMap;


/**
 *
 * @author alimo
 */
public class EmployeeMapDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    
    {
        
        EmployeeMap employeeinfo = new EmployeeMap();
        
        Employee Employee1 = new Employee(23454,"ini");
        Employee Employee2 = new Employee(12345,"mini");
        Employee Employee3 = new Employee(22222,"miny");
        
        employeeinfo.addemployee(Employee1);
        employeeinfo.addemployee(Employee2);
        employeeinfo.addemployee(Employee3);
        
        System.out.println(employeeinfo.getEmployeeByID(23454));
        System.out.println(employeeinfo.getEmployeeByID(12345));
        System.out.println(employeeinfo.getEmployeeByID(22222));
        
        //if Employee doesn't exist 
        //inputed nonexistant employee
        Employee getemployee = employeeinfo.getEmployeeByID(2345);
        
        if (getemployee != null) {
            System.out.println("Employee found: " + getemployee);
        } else {
            System.out.println("Employee not found.");
        }
   
       
    }
    
}
 