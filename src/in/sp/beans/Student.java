package in.sp.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	private int rollno;
	private String name;

	@Autowired
	@Qualifier("createAddrObj2")
	private Address address;
	@Autowired
	private Subjects subjects;

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void display() {
		System.out.println("Rollno : " + rollno);
		System.out.println("Name : " + name);
		System.out.println("Address : " + address);
		System.out.println("Subject1 :" + subjects);
//		System.out.println("subject2 :" +);
//		System.out.println("Subject3 :" + );
//		System.out.println("subject4 :" + );
	}

}
