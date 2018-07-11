package com.suraj.hibernate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.suraj.hibernate.model.Employee;

public class ClientTest {

	public static void main(String[] args) {
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		
		//Employee employee = (Employee) session.get(Employee.class, 1001);
		
		Employee employee = (Employee) session.load(Employee.class, 1001);
		System.out.println(employee.getEmployeeId()+"\t"+employee.getEmployeeName()+"\t"+employee.getSalary());
		
		session.close();
		factory.close();
	}

}
