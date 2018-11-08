# ClientRelationshipManagementSystem
# Steps:
# 1. Create Web project, and import related jars
# 2. Create related config files
## 2.1 Struts2  
### web.xml
#### core-filter
### struts.xml
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
	
	


#User register function implementation

	
	