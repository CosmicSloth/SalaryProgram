
public class SalariedEmployee extends Employee
{
   private double annualSalary;

   public SalariedEmployee(String name, int id, double salary, String jobTitle)
   {
	  super(name, id, jobTitle);
      setName(name);
      annualSalary = salary;
 
   }

   public double weeklyPay() 
   {
      final int WEEKS_PER_YEAR = 52;
      return annualSalary / WEEKS_PER_YEAR;
   }
}
