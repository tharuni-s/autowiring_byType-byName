package bytype;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bytype.Employee;

public class Access {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory context = new ClassPathXmlApplicationContext("bytype.xml");
		Employee emp=context.getBean("emp1",Employee.class);
		System.out.println(emp.getEmpId());
		System.out.println(emp.getEmpName());
		System.out.println(emp.getEmpEmail());
		System.out.println(emp.getPancard());
	}

}
