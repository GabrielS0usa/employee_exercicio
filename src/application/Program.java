package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of employees: ");
		int n = sc.nextInt();
		
		List<Employee>list = new ArrayList<>();
		
		for (int i=0; i < n; i++) {
			System.out.println("Employee #" + (i+1) + " data:");
			System.out.println("Outsourced (y/n)? ");
			char op = sc.next().charAt(0); 
			if (op == 'y') {
				sc.nextLine();
				System.out.print("Name: ");
				String nome = sc.nextLine();
				System.out.print("Hours: ");
				int hours = sc.nextInt();
				System.out.print("Value per hour: ");
				double valuePerHour = sc.nextDouble();
				System.out.print("Additional charge: ");
				double additional = sc.nextDouble();
				
				Employee emp = new OutsourcedEmployee(nome, hours, valuePerHour, additional);
				list.add(emp);
			}else if(op == 'n') {
				sc.nextLine();
				System.out.print("Name: ");
				String nome = sc.nextLine();
				System.out.print("Hours: ");
				int hours = sc.nextInt();
				System.out.print("Value per hour: ");
				double valuePerHour = sc.nextDouble();
				
				Employee emp1 = new Employee(nome, hours, valuePerHour);
				list.add(emp1);
			}
		}
		
		System.out.println();
		for (Employee emp : list) {
			System.out.println(emp.toString()); 
		}
		
		sc.close();
	}

}
