package younus.attari.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
public class ConfigurationBoot {
	

	@Autowired
	SpringPropertiesPlaceHolder placeHolder;

	@Bean
	public InternalResourceViewResolver getViewResolver(){
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setSuffix(".jsp");
		viewResolver.setPrefix("../WEB-INF/jsp/");
		return viewResolver;
	}
	
	@Bean
	public DriverManagerDataSource getDataSource(){
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUrl(placeHolder.getProperty("db.url"));
		dataSource.setUsername(placeHolder.getProperty("db.username"));
		dataSource.setPassword(placeHolder.getProperty("db.password"));
		return dataSource;
	}
	
	@Bean
	public JdbcTemplate getJdbcTemplate(){
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(new ConfigurationBoot().getDataSource());
		return jdbcTemplate;
	}
}
