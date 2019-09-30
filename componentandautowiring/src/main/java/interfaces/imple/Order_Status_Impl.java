package interfaces.imple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("order_status_impl")
public class Order_Status_Impl implements Order {
	
	@Autowired
	private Payment_Type_And_Status_Impl payment_type_and_status_impl;

	/*
	 * public Payment_Status_Impl getPs() { return ps; }
	 * 
	 * public void setPs(Payment_Status_Impl ps) { this.ps = ps; }
	 */


	public Payment_Type_And_Status_Impl getPayment_type_and_status_impl() {
		return payment_type_and_status_impl;
	}

	public void setPayment_type_and_status_impl(Payment_Type_And_Status_Impl payment_type_and_status_impl) {
		this.payment_type_and_status_impl = payment_type_and_status_impl;
	}

	@Override
	public void orderStatus() {
		payment_type_and_status_impl.is_payment_made();
		System.out.println("order is shipped");
	}

}
