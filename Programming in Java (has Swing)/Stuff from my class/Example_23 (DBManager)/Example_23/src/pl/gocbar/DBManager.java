package pl.gocbar;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public  class DBManager {

	private Properties props;
	private Connection connection;
	private Statement statement;

	public DBManager() throws IOException, SQLException {	
		this.readDatabaseProperties();
		this.connect();
	}

	private void readDatabaseProperties() throws IOException {
		props = new Properties();
		try (InputStream in = Files.newInputStream(Paths.get("database.properties"))) {
			props.load(in);
		}
		String drivers = props.getProperty("jdbc.drivers");
		if (drivers != null)
			System.setProperty("jdbc.drivers", drivers);
	}

	public Connection connect() throws SQLException {
		String url = props.getProperty("jdbc.url");
		String username = props.getProperty("jdbc.username");
		String password = props.getProperty("jdbc.password");
		System.out.println("Connected to database" + url);
		return DriverManager.getConnection(url, username, password);
	}

	public void createTable(String sqlQuery) {
		try {
			System.out.println("Tworzę tabele");
			connection = connect();
			connection.setAutoCommit(false);
			statement = connection.createStatement();
			statement.executeUpdate(sqlQuery);
			connection.commit();
		} catch (SQLException ex) {
			try {
				connection.rollback();
			} catch (SQLException ex1) {
			}
			System.out.println("Błąd podczas tworzenia tabel\n" + ex);
		}
	}

	public void useDataBase() throws SQLException {
		statement.executeUpdate("USE wspa");
	}
}
