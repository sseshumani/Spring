package interfaces.imple;

import org.springframework.stereotype.Component;

@Component
public class Payment_Type_And_Status_Impl implements Payment {

	@Override
	public void is_payment_made() {
		System.out.println("payment done by amazon prime acc");
	}

}
