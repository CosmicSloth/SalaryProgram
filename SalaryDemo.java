import java.io.*;
import java.util.*;

public class SalaryDemo {
   public static void main(String[] args) throws FileNotFoundException {
	  ArrayList<Employee> staff = new ArrayList<Employee>();
	  Scanner in = new Scanner(System.in);
	  Scanner fileIn = new Scanner(new File("staffInfo.txt"));
	  int choice = 0; 
	  boolean found;
	  
	  do {
		  System.out.println("\nSt. John's University Payroll Menu:\n");
		  System.out.println("1 - Add new employee");
		  System.out.println("2 - Display all employees");
		  System.out.println("3 - Search for employee (by ID)");
		  System.out.println("4 - Search for employee (by job title)");
		  System.out.println("5 - Remove employee (by ID)");
		  System.out.println("6 - Exit");
		  
		  System.out.println("\nEnter choice: ");
		  choice = in.nextInt();
		  
	// Choice 1
		  if(choice == 1) {
			  found = false;
			  System.out.println("\nPlease specify employee type:\n");
			  System.out.println("1 - Hourly employee");
			  System.out.println("2 - Salaried employee");
			  System.out.println("3 - Manager");
			  
			  System.out.println("\nEnter choice: ");
			  choice = in.nextInt();
			  
			  // Hourly
			  if(choice == 1) {
				  System.out.println("Name: ");
				  String name = in.nextLine();
				  in.nextLine();
				  System.out.println("ID: ");
				  int id = in.nextInt();
				  System.out.println("Job Title: ");
				  String jobTitle = in.nextLine();
				  in.nextLine();
				  System.out.println("Hourly Wage: ");
				  double wage = in.nextDouble();
				  System.out.println("Hours Worked: ");
				  double hours = in.nextDouble();
				  
				  staff.add(new HourlyEmployee(name, id, jobTitle, wage, hours));
			  }
			  
			  // Salaried
			  if(choice == 2) {
				  System.out.println("Name: ");
				  String name = in.nextLine();
				  in.nextLine();
				  System.out.println("ID: ");
				  int id = in.nextInt();
				  System.out.println("Job Title: ");
				  String jobTitle = in.nextLine();
				  in.nextLine();
				  System.out.println("Annual Salary: ");
				  double salary = in.nextDouble();
				 
				  
				  staff.add(new SalariedEmployee(name, id, salary, jobTitle));
			  }
			  
			  // Manager
			  if(choice == 3) {
				  System.out.println("Name: ");
				  String name = in.nextLine();
				  in.nextLine();
				  System.out.println("ID: ");
				  int id = in.nextInt();
				  System.out.println("Job Title: ");
				  String jobTitle = in.nextLine();
				  in.nextLine();
				  System.out.println("Annual Salary: ");
				  double salary = in.nextDouble();
				  in.nextLine();
				  System.out.println("Weekly Bonus: ");
				  double bonus = in.nextDouble();
				  
				  staff.add(new Manager(name, id, salary, bonus, jobTitle));
			  }
		  }
		  
	// Choice 2
		  if(choice == 2) {
			  for(Employee e : staff) {
				  e.display();
			  }
		  }
	  
	  
	  
	  
      
      
	  } while (choice !=6);
   }
}

