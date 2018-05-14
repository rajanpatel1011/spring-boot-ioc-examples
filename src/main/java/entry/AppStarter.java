package entry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import entry.beans.Customer;
import entry.beans.Employee;

@SpringBootApplication
public class AppStarter {
	public static void main(String[] args) {
		SpringApplication.run(AppStarter.class);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("entry");
		context.refresh();
		Employee emp =(Employee) context.getBean("emp");
		Employee emp1 =(Employee) context.getBean("emp");
		System.out.println(emp==emp1);
		System.out.println(emp.equals(emp1));
		Customer c =(Customer) context.getBean("customer");
		System.out.println(c);
	}

}
