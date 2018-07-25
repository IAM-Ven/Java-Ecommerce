# Java-Ecommerce
This is a java ecommerce application that is made with Spring MVC framework. The application uses JSP for dynamic pages optimised for Java. The application currently has a page controller that helps the view and the model communicate. On the back-end, we have an h2 database engine running on local machine that is hosting thee tables (Account Users, Listed Products, and Categories for Products). The application is served on Tomcat server for now. The user interface is a modified version of a free theme borrowed from KeenThemes. 

## To run this application:
To run this application, you need to clone it into your IDE and run Maven clean and Maven Project Update. 
Next, you will need to download a Tomcat server into your folder and configure Tomcat to point to your server runtime enviroment. And serve the application on Tomcat.
Finally, this application requires that you to download an h2 database engine on your machine and serve the sql file that is included in javaecom-backend folder in the application. Follow the h2 instruction on their website, their database is served on localhost:8082 on your machine (it should start automatically on your browser though). After coping the SQL into the h2 database in the browser, simply run it and it will serve the datas in your local machine. 

Now go to localhost:8080/javaecom to access the application.

