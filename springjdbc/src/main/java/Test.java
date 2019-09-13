import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.BT.spring.springjdbc.employee.dao.EmployeeDao;
import com.BT.spring.springjdbc.employee.dto.Employee;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/BT/spring/springjdbc/employee/test/config.xml");
		EmployeeDao dao = (EmployeeDao) ctx.getBean("employeeDao");		
		Employee employee = new Employee();
		employee.setId(14);
		employee.setFirstName("Bob");
		employee.setLastName("fergusen");
	//	int result = dao.create(employee);
	//	int result=dao.update(employee);
		int result=dao.delete(0);
		System.out.println("number of rows deleted "+result);
		
		
	}

}
