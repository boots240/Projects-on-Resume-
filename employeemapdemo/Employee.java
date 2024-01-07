package employeemapdemo;

/**
 *
 * @author alimo
 */
public class Employee 
{
   private String employeename;
   private int employeeID;
   
   public Employee(int employeeID,String employeename)
   {
       this.employeename = employeename;
       this.employeeID = employeeID;
   }
   
   public String getemployeename()
   {
       return employeename;
   }
   
   public int getemployeeID()
   {
       return employeeID;
   }
   
   
   public void setemployeename(String employeename)
   {
       this.employeename = employeename;
   }
   
   public void setemployeeId(int employeeId)
   {
       this.employeeID = employeeId;
   }
   
    @Override
   public String toString()
   {
       return "Employee [ID: " + employeeID + ", Name: " + employeename + "]";
   }
   
   
    
}
