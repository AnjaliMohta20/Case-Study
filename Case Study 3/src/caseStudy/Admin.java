package caseStudy;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import caseStudy.Employee;

public class Admin {
	
	public static void main(String[] args) {
		
		HashMap<Integer,Employee> employee= new HashMap <Integer,Employee>();
		
		 int Eid=100;
		while (true) {
			System.out.println("Employee Management System");
			System.out.println("1. Add Employee");
			System.out.println("2. update Employee Details");
			System.out.println("3. Get Employee Details");
			System.out.println("4. Get All Employee Details");
			System.out.println("5. Delete Employee Details");
			System.out.println("6. Exit");
			
			Scanner sc=new Scanner(System.in);
			int option = sc.nextInt();
			
			switch(option){
				
			case 1:
				
				System.out.println("Enter Details to add Employee");
				//System.out.println("Enter Employee Id");
				System.out.println("Enter Employee Name");
				String Ename=sc.next();
				System.out.println("Enter Employee Department");
				String Edept=sc.next();
				System.out.println("Enter Employee salary");
				int salary=sc.nextInt();
				
				Employee Emp =new Employee(Ename,Edept,salary);
				employee.put(++Eid,Emp);
				System.out.println("Employee Added Successfully: "+Eid);
				
				break;
				
			case 2:
				
				System.out.println("Enter Details to Update Employee");
				System.out.println("Enter Employee Id");
				int Eid1=sc.nextInt();
				//System.out.println("Enter Employee Id");
				System.out.println("Enter Employee Name");
				String Ename1=sc.next();
				System.out.println("Enter Employee Department");
				String Edept1=sc.next();
				System.out.println("Enter Employee salary");
				int salary1=sc.nextInt();
				
				Employee Emp1 =new Employee(Ename1,Edept1,salary1);
				employee.put(Eid1,Emp1);
				System.out.println("Employee Updated Successfully: "+Eid);
				
				break;
			case 3:
				
				System.out.println("Enter id to get Employee Details");
				int Eid2=sc.nextInt();
				Employee emp2=employee.get(Eid2);
				//System.out.println("Employee: "+Eid2);
				System.out.println(emp2);
				
				break;
			case 4:
				
				Set<Entry<Integer,Employee>> result=employee.entrySet();
				Iterator<Entry<Integer,Employee>> itr=result.iterator();
				
				while(itr.hasNext()) {
					Entry<Integer,Employee> finalResult = itr.next();
					
					System.out.println(finalResult.getKey()+" "+finalResult.getValue());
				}
				
				break;
			case 5:
				
				System.out.println("Enter id of Employee to be deleted");
				int Eid3=sc.nextInt();
				Employee emp3=employee.remove(Eid3);
				System.out.println("Employee Deleted: "+Eid3);
				
				break;
			case 6:
				System.exit(0);
			default:
				
				System.out.println("Wrong Selection....Enter Again ");
				
			}
			
		}

	}

}
