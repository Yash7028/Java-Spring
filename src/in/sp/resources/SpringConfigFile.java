package in.sp.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;
import in.sp.beans.Subjects;

@Configuration
public class SpringConfigFile {

	@Bean
	public Address createAddrObj1() {
		Address addr = new Address();
		addr.setHouseno(111);
		addr.setCity("mumbai");
		addr.setPincode(401206);

		return addr;
	}

	@Bean
	public Address createAddrObj2() {
		Address addr = new Address();
		addr.setHouseno(222);
		addr.setCity("delhi");
		addr.setPincode(551206);

		return addr;
	}

	@Bean
	public Subjects createSubjObj() {
		Subjects subj = new Subjects();
		List<String> subjects_list = new ArrayList<String>();
		subjects_list.add("java");
		subjects_list.add("python");
		subjects_list.add("JavaScript");
		subjects_list.add("Ruby");

		subj.setSubjects(subjects_list);
		return subj;
	}

	@Bean
	public Student createStudObj() {
		Student std = new Student();
		std.setName("yash");
		std.setRollno(17);
//		std.setAddress(createAddrObj());
//		std.setSubjects(createSubjObj());
		return std;
	}
}
