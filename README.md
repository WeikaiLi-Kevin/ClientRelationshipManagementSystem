# ClientRelationshipManagementSystem

Steps:

1. Create Web project, and import related jars

2. Create related config files
	2.1 Struts2  framework
		web.xml
			core-filter
		struts.xml
	2.2 Spring framework
		jdbc.properties
		log4j.properties
		applicationContext.xml
		web.xml
			spring core listener
	2.3 Hibernate framework
		hibernate.cfg.xml     spring can instead to manage it

3. Create related packages
	com.weikaili.crm.domain
	com.weikaili.crm.service
	com.weikaili.crm.dao
	com.weikaili.crm.web.action
	com.weikaili.crm.web.interceptor
	
4. Create html(jsp) pages
5. Create related classes
	domain: User
	dao: UserDao
	dao.impl	 UserDaoImpl
	service: UserService
	service.impl UserServiceImpl
	web.action UserAction extends ActionSupport implements ModelDriven

6. Confige related class into Spring (applicationContext.xml)
	
	add <bean id="" class="com.weikaili.crm...."></bean> for Action, Service, and DAO
	
	


## User register function implementation

1. Create a register jsp file 
2. Create a table 
3. Create entity : User.java
4. add Action and inject Service into Action
5. confige action in struts.xml
5. Create Service and inject Dao 
6. add Hibernate into sessionFactory in applicationContext.xml
   Dao extends HibernateDaoSupport class
   Dao inject SessionFactory
7. Spring transaction configuration
	configure transaction manager
	start annotation transaction
	add transaction annotation in service layer  -- add @Transactional to serviceimpl class

8. Create login method in action 
   check the user exists or not and call login method in userService 

9. Create login method in Service
	set user'password by using MD5Utils and call login method in userDao

10. Create login method in DAO
	get users list by using this.getHibernateTemplate().find(query,*);

11. pages configuration 
	struts.xml: add result "login" -> /login.jsp
				add result "success" type="redirect" -> /index.jsp
12 show data on related pages
	success: <s:property value="#session.existUser.user_name"/>
	fail: <s:actionerror/>

## User save function implementation
1. Create tables crm_cst_customer.sql
2. create files: customer javabean + customer.hbm.xml
3. Create related classes
	3.1 Create CustomerDao interface and CustomerDaoImpl class
	3.2 Create CustomerService and CustomerServiceImpl 
		Inject customerDao and setter method
	3.3 Create CustomerAction extends ActionSupport implements ModelDriven<Customer>
		Inject CustomerService and setter method

4. Add all classess into spring applicationContext.xml		
5. Jump to the page to add customer
	add method in CustomerAction and config in struts.xml
6. add dictionary
	Create data dictionary
		table, entity and hbm.xml files
	Create dictionary and client relationship mapping
		modify customer entity add one-to-many relationship 
	Create dictionary's Action, Service, and DAO
	Add all classes related to dictionary to applicationContext.xml (Spring)
	Create entity for dictionary and mapping
7. Asynchronous loading dictionary on the page of adding customer

## Save data in the page of adding customer to database
1. modify form in add.jsp 
2. add action, service, and dao classes
3. add transaction to service

## Query client with pagination
1. modify menu.jsp
2. add findAll method to Action file
3. create service for pagination
4. create DAO for pagination
5. config page jump function
6. add function on list.jsp file to show data and page bar

## The function to modify customer