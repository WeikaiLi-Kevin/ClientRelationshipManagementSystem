package com.weikaili.crm.web.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.weikaili.crm.domain.Customer;
import com.weikaili.crm.service.CustomerService;

public class CustomerAction extends ActionSupport implements
		ModelDriven<Customer> {
private Customer customer = new Customer();
	@Override
	public Customer getModel() {
		// TODO Auto-generated method stub
		return customer;
	}
	
	private CustomerService customerService;
	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}
	/* used to page jump */
	public String saveUI(){
		//query dictionary data   or ajax yibu
		return "saveUI";
	}
}
