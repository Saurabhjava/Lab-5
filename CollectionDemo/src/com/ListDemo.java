package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List<Employee> li=new ArrayList<Employee>();
		
		li.add(new Employee("Raj", 56000));
		li.add(new Employee("Amit", 46000));
		li.add(new Employee("Sumit", 86000));
		li.add(new Employee("Aditya", 36000));
		li.add(new Employee("Saurabh", 26000));
		System.out.println(li.size());
		/*
		 * for(Employee e:li) { //System.out.println(e.getName() +"\t"+ e.getSalary());
		 * if(e.getSalary()>50000) li.remove(e); }
		 */
		Iterator<Employee> i=li.iterator();
		while(i.hasNext()) {
			Employee e=i.next();
			if(e.getSalary()>50000)
				i.remove();
		}
		System.out.println(li);
	}

}
