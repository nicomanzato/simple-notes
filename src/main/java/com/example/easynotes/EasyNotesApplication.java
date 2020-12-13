package com.example.easynotes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@ImportResource({  
	"classpath:com/example/easynotes/beans/sessionFactoryBean.xml",
	"classpath:com/example/easynotes/beans/entityManagerBean.xml",
	"classpath:com/example/easynotes/beans/persistenceUnitManagerBean.xml",
	"classpath:com/example/easynotes/beans/repositoriesBean.xml",
	"classpath:com/example/easynotes/beans/servicesBean.xml",
	// "classpath:com/example/easynotes/beans/controllersBean.xml",
	// "classpath:com/example/easynotes/beans/transactionManagerBean.xml" 
})
@SpringBootApplication
public class EasyNotesApplication {

	public static void main(String[] args) {
		SpringApplication.run(EasyNotesApplication.class, args);
	}

}


/*

CREATE TABLE NOTEBOOK
(
	ID_NOTEBOOK INT(19) NOT NULL
)

CREATE TABLE NOTE
(
	ID_NOTE INT(19) NOT NULL AUTO_INCREMENT,
	ID_NOTEBOOK INT(19),
	TITLE VARCHAR(50),
	CONTENT VARCHAR(50),
	CREATED_AT DATE,
	UPDATED_AT DATE
)

*/