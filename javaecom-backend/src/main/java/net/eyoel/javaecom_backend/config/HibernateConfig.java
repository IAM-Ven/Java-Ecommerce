package net.eyoel.javaecom_backend.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages = { "net.eyoel.javaecom_backend.dto" })
@EnableTransactionManagement
public class HibernateConfig {

	private final static String DATABASE_URL = "jdbc:h2:tcp://localhost/~/javaecom";
	private final static String DATABASE_DRIVER = "org.h2.Driver";
	private final static String DATABASE_DIALECT = "org.hibernate.dialect.H2Dialect";
	private final static String DATABASE_USERNAME = "sa";
	private final static String DATABASE_PASSWORD = "";

	// beans to get the dataSource

	@Bean("dataSource")
	public DataSource getDataSource() {
		BasicDataSource dataSource = new BasicDataSource();

		// configures the database using BasicDataSource object
		dataSource.setDriverClassName(DATABASE_DRIVER);
		dataSource.setUrl(DATABASE_URL);
		dataSource.setUsername(DATABASE_USERNAME);
		dataSource.setPassword(DATABASE_PASSWORD);

		return dataSource;
	}

	@Bean
	public SessionFactory getSessionFactory(DataSource dataSource) {
		Properties getHibernateProperties = this.hibernateProperties();
		LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);

		sessionBuilder.addProperties(getHibernateProperties);
		sessionBuilder.scanPackages("net.eyoel.javaecom_backend.dto");
		return sessionBuilder.buildSessionFactory();
	}

	@Bean
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
		return transactionManager;
	}

	private Properties hibernateProperties() {

		Properties properties = new Properties();
		properties.put("hibernate.dialect", DATABASE_DIALECT);
		properties.put("hibernate.show_sql", "true");
		properties.put("hibernate.format_sql", "true");
		return properties;

	}
}
