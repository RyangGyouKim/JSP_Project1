<<<<<<< HEAD
/*package jdbc;

import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.apache.commons.dbcp2.ConnectionFactory;
import org.apache.commons.dbcp2.DriverManagerConnectionFactory;
import org.apache.commons.dbcp2.PoolableConnection;
import org.apache.commons.dbcp2.PoolableConnectionFactory;
import org.apache.commons.dbcp2.PoolingDriver;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;

public class DBCPInit extends HttpServlet {
	
	
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		loadJDBCDriver();
		initConnectionPool();
	}

	
	private void loadJDBCDriver() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}catch(ClassNotFoundException ex) {
			throw new RuntimeException("fail to load JDBC Driver", ex);
		}
	}
	
	private void initConnectionPool() {
		// TODO Auto-generated method stub
		try {
			String jdbcUrl = "jdbc:mysql://localhost:3306/test?" +
							 "userUnicode=true&characterEncoding=utf8";
			String username = "root";
			String pw = "password";
			
			ConnectionFactory connFactory = new DriverManagerConnectionFactory(jdbcUrl, username, pw);
			PoolableConnectionFactory poolableConnFactory = new PoolableConnectionFactory(connFactory, null);
			poolableConnFactory.setValidationQuery("select 1");
			
			GenericObjectPoolConfig poolConfig = new GenericObjectPoolConfig();
			poolConfig.setTimeBetweenEvictionRunsMillis(1000L * 60L * 5L);
			poolConfig.setTestWhileIdle(true);
			poolConfig.setMinIdle(4);
			poolConfig.setMaxTotal(50);
			
			GenericObjectPoolConfig<PoolableConnection> connectionPool = new GenericObjectPoolConfig<>(poolableConnFactory, poolConfig);
			poolableConnFactory.setPool(connectionPool);
			
			Class.forName("org.apache.commons.dbcp2.PoolingDriver");
			PoolingDriver driver = (PoolingDriver)DriverManager.getDriver("jdbc:apache:commons:dbcp:");
			driver.registerPool("test", connectionPool);
		}catch(Exception e){
			throw new RuntimeException(e);
			
		}
	}
}
*/
=======
package jdbc;

import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.apache.commons.dbcp2.ConnectionFactory;
import org.apache.commons.dbcp2.DriverManagerConnectionFactory;
import org.apache.commons.dbcp2.PoolableConnection;
import org.apache.commons.dbcp2.PoolableConnectionFactory;
import org.apache.commons.dbcp2.PoolingDriver;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;

public class DBCPInit extends HttpServlet {
	
	
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		loadJDBCDriver();
		initConnectionPool();
	}

	
	private void loadJDBCDriver() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}catch(ClassNotFoundException ex) {
			throw new RuntimeException("fail to load JDBC Driver", ex);
		}
	}
	
	private void initConnectionPool() {
		// TODO Auto-generated method stub
		try {
			String jdbcUrl = "jdbc:mysql://localhost:3306/test?" +
							 "userUnicode=true&characterEncoding=utf8";
			String username = "root";
			String pw = "password";
			
			ConnectionFactory connFactory = new DriverManagerConnectionFactory(jdbcUrl, username, pw);
			PoolableConnectionFactory poolableConnFactory = new PoolableConnectionFactory(connFactory, null);
			poolableConnFactory.setValidationQuery("select 1");
			
			GenericObjectPoolConfig poolConfig = new GenericObjectPoolConfig();
			poolConfig.setTimeBetweenEvictionRunsMillis(1000L * 60L * 5L);
			poolConfig.setTestWhileIdle(true);
			poolConfig.setMinIdle(4);
			poolConfig.setMaxTotal(50);
			
			GenericObjectPoolConfig<PoolableConnection> connectionPool = new GenericObjectPoolConfig<>(poolableConnFactory, poolConfig);
			poolableConnFactory.setPool(connectionPool);
			
			Class.forName("org.apache.commons.dbcp2.PoolingDriver");
			PoolingDriver driver = (PoolingDriver)DriverManager.getDriver("jdbc:apache:commons:dbcp:");
			driver.registerPool("test", connectionPool);
		}catch(Exception e){
			throw new RuntimeException(e);
			
		}
	}
}
>>>>>>> branch 'master' of https://github.com/RyangGyouKim/JSP_Project1.git
