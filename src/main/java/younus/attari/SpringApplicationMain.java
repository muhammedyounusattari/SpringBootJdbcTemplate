package younus.attari;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("younus.attari")
@EnableAutoConfiguration
public class SpringApplicationMain  extends SpringBootServletInitializer  {

	   public static void main(String[] args) {
	        SpringApplication.run(applicationClass, args);
	    }
	 
	    @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	        return application.sources(applicationClass);
	    }
	 
	    private static Class<SpringApplicationMain> applicationClass = SpringApplicationMain.class;
}
