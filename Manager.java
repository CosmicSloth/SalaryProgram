
public class Manager extends SalariedEmployee
{
   private double weeklyBonus;

   public Manager(String name, int id, double salary, double bonus, String jobTitle)
   {
      super(name, id, salary, jobTitle);
      weeklyBonus = bonus;
   }

   public double weeklyPay()
   {
      return super.weeklyPay() + weeklyBonus;
   }
}


