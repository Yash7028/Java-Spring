package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;

@Configuration
public class SpringConfigFile {
	
	@Bean
public Address createAddrObj() {
	Address addr = new Address();
	addr.setHouseno(111);
	addr.setCity("mumbai");
	addr.setPincode(401206);
	
	return addr ;
}
	@Bean
	public Student createStudObj() {
		Student std =new Student();
		std.setName("yash");
		std.setRollno(17);
//		std.setAddress(createAddrObj());
		return std;
	}
}


