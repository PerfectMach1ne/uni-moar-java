package pl.gocbar;

import java.io.IOException;
import java.sql.SQLException;

public class PersonManager extends DBManager {

	private String createUser = "CREATE TABLE if not exists person(" + "id INT NOT NULL auto_increment, "
			+ "first_name Varchar(45), " + "last_name Varchar(45), " + "email Varchar(30), "
			+ "admin BOOL DEFAULT false, "
			+ "password VARCHAR(20) NOT NULL, " + "PRIMARY KEY(id))";
	
	public PersonManager() throws IOException, SQLException {
		super();
		createTable(createUser);
		System.out.println("Tabela person została utworzona. Zajrzyj do bazy danych!");
	}

}
