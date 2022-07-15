package Recursions.KunalKushwahaYT;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Emp {
	int empid;
	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpid() {
		return empid;
	}

	public String getName() {
		return name;
	}

	String name;
	
	public Emp(int empid, String name) {
		this.empid = empid;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Emp [empid=" + empid + ", name=" + name + "]";
	}
	
	
}

public class TestAnyCode {
	
	List<Emp> al;
	

	public List<Emp> getAl() {
		return al;
	}


	public void setAl(List<Emp> al) {
		this.al = al;
	}
	
	


	@Override
	public String toString() {
		return "TestAnyCode [al=" + al + "]";
	}


	public static void main(String[] args) {
		Emp e1= new Emp(1, "Deepak");
		Emp e2 = new Emp(2, "Manish");
		Emp e3 = new Emp(3, "Jeeni");
		
		List<Emp> all = new ArrayList<Emp>();
		all.add(e1);
		all.add(e2);
		all.add(e3);
		
		TestAnyCode t = new TestAnyCode();
		t.setAl(all);
		
		System.out.println(t);
		
		List<Emp> al2 = t.getAl();
		System.out.println(al2);

		for(Emp e : al2) {
			e.setEmpid(e.getEmpid()+100);
		}
		
		System.out.println("after: ");
		System.out.println(al2);
		System.out.println(t);
		
	}

}
