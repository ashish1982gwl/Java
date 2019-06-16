package com.ashish.general;

import java.util.*;

class Employee {
	public Employee(String name, String age) {
		this.name = name;
		this.age = age;
	}

	private String name;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	private String age;

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}
	
	
}

public class HashCodeAndEqualsMeathodExample {

	public static void main(String arg[]) {
		Employee Employee1 = new Employee("ashish", "30");
		Employee Employee2 = new Employee("ashish", "40");
		System.out.println(Employee1 == Employee2);
		System.out.println(Employee1.equals(Employee2));

		Set<Employee> objSet = new HashSet<Employee>();
		objSet.add(Employee1);
		objSet.add(Employee2);
		objSet.forEach(action -> {
			System.out.println(action.toString());
		});

		Map objMap = new HashMap<Employee, Boolean>();
		objMap.put(Employee1, true);
		objMap.put(Employee2, false);
		
		objMap.entrySet().forEach(action -> {
		System.out.println(action);
		});

	}
}
