package com.revature;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.revature.data.exception.DataServiceException;
import com.revature.data.impl.StudentAccountDAOImpl;

@SpringBootApplication
@ImportResource("classpath:spring-config.xml")
public class Application extends SpringBootServletInitializer {

  private static Logger logger = Logger.getLogger(Application.class);

  @Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
    logger.info("Initializing the spring boot");
    return builder.sources(Application.class);
  }
  
  
//  public static void main(String[] args) throws DataServiceException {
//	
//	  ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
//	  StudentAccountDAOImpl bean = ctx.getBean(StudentAccountDAOImpl.class);
//	  System.out.println( bean.getId("aiswaryaravindarn240@gmail.com","ais0805"));
//	  
//}



}
