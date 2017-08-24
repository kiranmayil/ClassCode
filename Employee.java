package com.wbl.Collections;

public class Employee{ //implements Comparable<Employee>{

	private int id;
	private String name;

	public Employee(int id, String name){
		this.id = id;
		this.name = name;
	}

	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}

	public String getnName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}


	@Override
	public boolean equals(Object o){
		if(o instanceof Employee){
			Employee e2 = (Employee)o;
			if(this.id == e2.id && this.name ==e2.name){
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode(){
		return id;
	}

	/*@Override
	public boolean equals(Object o){
		if(o instanceof Employee){
			Employee e2 = (Employee)o;
			if(this.id==e2.id && this.name ==e2.name){
				return true;
			}
		}
		return false;
	}


	public static void main(String[] args) {
		//Employee e1 = new Employee(1,"John");
		//Employee e2 = new Employee(2,"Alex");
	}

	/*@Override
	public int compareTo(Employee o) {
		int result =0;
		if(this.id>o.id){
			return 1;
		}else if(this.id<o.id){
			return -1;
		}

		//int result = this.id-0,id;
		return result;
	}*/



}
