package younus.attari.config;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service("placeHolder")
@Scope("singleton")
@PropertySource("select-sql-queries.xml")
public class SpringPropertiesPlaceHolder {
	
	@Autowired
	private Environment env;
	private static Environment environment;
	
	@PostConstruct
	public void intializeEnv(){
		environment=env;
	}
	
	
	public static String getProperty(String str){
		return environment.getProperty(str);
	}
}
