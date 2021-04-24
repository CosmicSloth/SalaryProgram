
public abstract class Employee
{
   private String name;
   private int id;
   private String jobTitle;

   public Employee(String name, int id, String jobTitle) {
      name = "";
   }
         
   public void setName(String employeeName) {
      name = employeeName;
   } 
   public String getName() {
      return name; 
   }
   
   
  public int getId() {
	  return id;
  }
   public void setId(int id) {
	   this.id=id;
   }
   
   
  public String getJobTitle() {
	  return jobTitle;
  }
  public void setJobTitle(String jobTitle) {
	  this.jobTitle = jobTitle;
  }
   

	public void display() {
		System.out.printf("%16s %4d %12s", name, id, jobTitle);
		
	}

	
  
  
  
   
   public abstract double weeklyPay();

	
}

