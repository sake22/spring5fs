package config;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DbConfig {

	@Bean(destroyMethod = "close")
	public DataSource datasource() {
		DataSource ds = new DataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost/spring5?characterEncoding=utf8");
		ds.setUsername("root");
		ds.setPassword("rootspring50000");
		ds.setInitialSize(2);
		ds.setMaxActive(10);
		return ds;
	}
}
