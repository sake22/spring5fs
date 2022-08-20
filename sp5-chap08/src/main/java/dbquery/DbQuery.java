package dbquery;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class DbQuery {
	
	private JdbcTemplate jdbcTemplate;
	
	public DbQuery(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
}
