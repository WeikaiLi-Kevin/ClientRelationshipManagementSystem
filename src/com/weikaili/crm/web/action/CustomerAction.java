package com.weikaili.crm.web.action;

import org.hibernate.criterion.DetachedCriteria;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.weikaili.crm.domain.Customer;
import com.weikaili.crm.domain.PageBean;
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
	
	//set method to receive data:
	private Integer currPage = 1;
	/* used to page jump */
	public String saveUI(){
		//query dictionary data   or ajax yibu
		return "saveUI";
	}
	
	public String save() {
		customerService.save(customer);
		return NONE;
	}
	
	public String findAll() {
		//DetachedCriteria for conditional pagination
		DetachedCriteria detachedCriteria = DetachedCriteria.forClass(Customer.class);
		PageBean<Customer> pageBean =  customerService.findByPage(detachedCriteria,currPage,pageSize);
		ActionContext.getContext().getValueStack().push(pageBean);
		return "findAll";
	}



	public void setCurrPage(Integer currPage) {
		if(currPage == null) {
			currPage = 1;
		}
		this.currPage = currPage;
	}
	
	private Integer pageSize = 3;
	public void setPageSize(Integer pageSize) {
		if(pageSize == null) {
			pageSize = 3;
		}
		this.pageSize = pageSize;
	}
	
	public String delete() {
		//first query, then delete
		customer = customerService.findById(customer.getCust_id());
		customerService.delete(customer);
		return "deleteSuccess";
	}
	
	public String edit() {
		customer = customerService.findById(customer.getCust_id());
//		customerService.edit(customer);
//		ActionContext.getContext().getValueStack().push(customer);
		return "editSuccess";
	}
	
	public String update() {
		
		customerService.update(customer);
		return "updateSuccess";
	}
}
