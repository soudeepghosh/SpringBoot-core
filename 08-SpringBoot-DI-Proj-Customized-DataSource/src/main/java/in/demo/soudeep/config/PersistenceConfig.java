package in.demo.soudeep.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
public class PersistenceConfig {
	@Autowired
	private Environment environment;
	
	@Bean(name = "ds")
	public DataSource getDataSourceObj() {
		
		System.out.println("PersistenceConfig.getDataSourceObj()");
		
		//logic
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		// setting url, username, password
		dataSource.setJdbcUrl(environment.getProperty("spring.datasource.url"));
		dataSource.setUser(environment.getProperty("spring.datasource.username"));
		dataSource.setPassword(environment.getProperty("spring.datasource.password"));
		
		return dataSource;
	}
}
