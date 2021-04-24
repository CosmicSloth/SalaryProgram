
public class HourlyEmployee extends Employee
{
   private double hourlyWage;
   private double hoursWorked;
   
  
   public HourlyEmployee(String name, int id, String jobTitle, double wage, double hours)
   {
	  super(name, id, jobTitle);
      setName(name);
      setId(id);
      setJobTitle(jobTitle);
      hourlyWage = wage;
      hoursWorked = hours;
   }
 
   public double weeklyPay()
   {
      double pay = hoursWorked * hourlyWage;
      if (hoursWorked > 40)
      {
         pay = pay + ((hoursWorked - 40) * 0.5) * hourlyWage;
      }
      return pay;
   }
}

