## ms-employee-payroll-service

3rd Service of microservice hive to retrieve data from role and employee service and insert into db. 

1. Added feign, to use feign client instead of resttemplate. 
2. Enabled load-balancing of services with ribbon
3. Enabled registry to eureka
4. Enabled discovery of services for ribbon by eureka.
