/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee employee1 = new Employee(1987,"Dwight","Schrute",4416.66);
		employee1.employeeToString();
		Employee employee2 = new Employee(2474,"Jim","Halpert",4416.16);
		employee2.employeeToString();
		Employee employee3 = new Employee(2011,"Pam","Beesly",2250);
		employee3.employeeToString();
		Employee employee4 = new Employee(1111,"Bob","Billy",1);
		employee4.employeeToString();
		employee1.raiseSalary(10);
		employee2.raiseSalary(10);
		employee3.raiseSalary(10000);
		employee4.raiseSalary(0);
		System.out.println("New raised salaries: ");
		System.out.println(employee1.getFirstName()+"'s new salary: "+employee1.getSalary());
		System.out.println(employee2.getFirstName()+"'s new salary: "+employee2.getSalary());
		System.out.println(employee3.getFirstName()+"'s new salary: "+employee3.getSalary());
		System.out.println(employee4.getFirstName()+"'s new salary: "+employee4.getSalary());
		System.out.println("--------------------------------------------------");
		System.out.println("Annual salaries: ");
		System.out.println(employee1.getFirstName()+"'s annual salary: "+employee1.getAnnualSalary());
		System.out.println(employee2.getFirstName()+"'s annual salary: "+employee2.getAnnualSalary());
		System.out.println(employee3.getFirstName()+"'s annual salary: "+employee3.getAnnualSalary());
		System.out.println(employee4.getFirstName()+"'s annual salary: "+employee4.getAnnualSalary());

		
	}
}
