package norsys.technomaker;

import java.io.FileOutputStream;

import org.dbunit.database.DatabaseConfig;
import org.dbunit.database.DatabaseConnection;
import org.dbunit.database.IDatabaseConnection;

import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSet;
import org.dbunit.ext.mysql.MySqlMetadataHandler;

import norsys.technomaker.dao.ConnectionManager;

public class GenerateDataSet {

	public static void main(String[] args) throws Exception {

		// connection à la base source (baseX)
		Class.forName("com.mysql.jdbc.Driver");
		String schema = "tpfilrouge"; // schéma de la base source
		java.sql.Connection jdbcConnection = ConnectionManager.getConnection();

		IDatabaseConnection connection = new DatabaseConnection(jdbcConnection, schema);
		// On précise qu'on utilise Mysql
		connection.getConfig().setProperty(DatabaseConfig.PROPERTY_METADATA_HANDLER, new MySqlMetadataHandler());

		// Export de toute la base IdataSet : collection des tables
		IDataSet fullDataSet = connection.createDataSet();
		FlatXmlDataSet.write(fullDataSet, new FileOutputStream("full_data.xml"));

		System.out.println("Fichiers dataSet générés avec succès");

	}
}