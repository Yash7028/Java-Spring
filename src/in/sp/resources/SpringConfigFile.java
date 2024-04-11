package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Student;

@Configuration
public class SpringConfigFile {

//	@Bean
//	public Student stdId1() {
//		
//		Student std = new Student();
//		std.setName("yash");
//		std.setRollno(103);
//		std.setEmail("yash@gamil.com");
//		return std;
//	}
//	
	
	@Bean("stdObj1")
	public Student createStdBeanObj() {
		
		Student std = new Student();
		std.setName("yash");
		std.setRollno(103);
		std.setEmail("yash@gamil.com");
		return std;
	}
	@Bean("stdObj2")
	public Student createStdBeanObj2() {
		
		Student std = new Student();
		std.setName("Gaurav");
		std.setRollno(104);
		std.setEmail("gaurav@gamil.com");
		return std;
	}
}
