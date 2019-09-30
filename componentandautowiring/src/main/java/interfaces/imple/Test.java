package interfaces.imple;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				" interfaces/imple/config.xml");
		Order os = (Order) ctx.getBean("order_status_impl");
		os.orderStatus();
	}

}
