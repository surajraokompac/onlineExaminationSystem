package com.dj.configuration;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
@Configuration
@EnableWebMvc
@ComponentScan("com.dj")
@EnableTransactionManagement
public class WebAppConfig extends WebMvcConfigurerAdapter {
//to initialize the DS
	@Bean
	public InternalResourceViewResolver internalResourceViewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
		
	}
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.postgresql.Driver");
		dataSource.setUrl("jdbc:postgresql://localhost:5432/DJTEST");
		dataSource.setUsername("postgres");
		dataSource.setPassword("root");
		return dataSource;
		
	}
	@Bean
	public LocalSessionFactoryBean localSessionFactoryBean() {
		LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
		sessionFactoryBean.setDataSource(dataSource());
		sessionFactoryBean.setPackagesToScan("com.dj.domain");
	    sessionFactoryBean.setHibernateProperties(getProperty());
		return sessionFactoryBean;
		
	}
	private Properties getProperty() {
		Properties properties = new Properties();
		properties.put("hibernate.dialect", "org.hibernate.dialect.PostgreSQL9Dialect");
	    properties.put("hibernate.hbm2ddl.auto", "update");
	    properties.put("hibernate.connection.autocommit", "false");
		return properties;
	}
	@Bean
	public HibernateTransactionManager hibernateTransactionManager(SessionFactory sessionFactory) {
		HibernateTransactionManager htx = new HibernateTransactionManager(sessionFactory);
		return htx;
		
	}
	@Bean
	public HibernateTemplate hibernateTemplate(SessionFactory sessionFactory) {
		HibernateTemplate template = new HibernateTemplate(sessionFactory);
		template.setCheckWriteOperations(false);
		
		return template;
		
	}
	
}
