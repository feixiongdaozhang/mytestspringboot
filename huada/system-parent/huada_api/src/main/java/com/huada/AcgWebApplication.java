package com.huada;




import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
//@ComponentScan(basePackages={"com.huada.device_management_interface.ExampleInterface"})
@ComponentScan(basePackages={"com.huada"})
public class AcgWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(AcgWebApplication.class, args);
	}
/*	@Bean
	public EmbeddedServletContainerCustomizer containerCustomizer() {

	   return (container -> {
	        ErrorPage error401Page = new ErrorPage(HttpStatus.UNAUTHORIZED, "/401.html");
	        ErrorPage error404Page = new ErrorPage(HttpStatus.NOT_FOUND, "/404.html");
	        ErrorPage error500Page = new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "/500.html");

	        container.addErrorPages(error401Page, error404Page, error500Page);
	   });
	}*/
}
