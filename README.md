
# Awesome README [![Awesome](https://cdn.rawgit.com/sindresorhus/awesome/d7305f38d29fed78fa85652e3a63e154dd8e8829/media/badge.svg)](https://github.com/sindresorhus/awesome)

## Description :

- [Introduction]

In this project i've created simple microservices, In this project i've created one aaplication of server on which your services will hold up, one basic Account services which has data of username and bank number(i used JPA for accessing data from database you can use either use JDBC or H2), by the way you can create number of such services. and one last client application from which all data requests and responses operations should be handled  

- [Steps]

1) first run server application (it will run on port 1111 as i mentioned in application.yml), and by this url http://localhost:1111 you can see your Eureka cloud

2) run your services application (i've created only one service (named "Account") for demo and it will run on port:2222 as i mentioned in application.yml) now after successfully started service you can see over Eureka, your service should took a place over there and it if you want to verify whether your service is working properly or not you can check it out by url http://localhost:2222.

3)now run final client application which handles your all request and should response accordingly (in this project i simply create two rest call 1) all account and 2) account by number), this application will run on default port:8080 and you can access your accounts from this port as i configured it in my Account Controller class.

## Tools

- [Spring Tool Suite](https://spring.io/tools)
- [MySql Workbench](https://www.mysql.com/products/workbench/)

## References

- [Spring](https://spring.io/blog/2015/07/14/microservices-with-spring)
