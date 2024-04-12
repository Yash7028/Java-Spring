package in.sp.resources;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Student;

@Configuration
@ComponentScan("in.sp.beans")
// for multiple beans object creation
//@ComponentScan({"in.sp.beans", "-----", "------"})
//@ComponentScan(basePackages = {"in.sp.beans"})
public class SpringConfigFile {

}
