package norsys.technomaker;

import java.io.File;
import java.io.FileOutputStream;

import org.dbunit.database.DatabaseConfig;
import org.dbunit.database.DatabaseConnection;
import org.dbunit.database.IDatabaseConnection;

import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.dbunit.ext.mysql.MySqlMetadataHandler;
import org.dbunit.operation.DatabaseOperation;

import com.mysql.jdbc.Statement;

import norsys.technomaker.dao.ConnectionManager;

public class GenerateDataSet {

	public static void main(String[] args) throws Exception {

		// connection à la base source (baseX)

		String schema = "tpfilrouge"; // schéma de la base source
		java.sql.Connection jdbcConnection = ConnectionManager.getConnection();

		IDatabaseConnection connection = new DatabaseConnection(jdbcConnection, schema);
	
		connection.getConfig().setProperty(DatabaseConfig.PROPERTY_METADATA_HANDLER, new MySqlMetadataHandler());


		IDataSet fullDataSet = connection.createDataSet();
		FlatXmlDataSet.write(fullDataSet, new FileOutputStream("full_data.xml"));

		System.out.println("Fichiers dataSet générés avec succès");

		File dataSetFile = new File("full_data.xml");
		IDataSet dataSet = new FlatXmlDataSetBuilder().build(dataSetFile);

		Statement statement = (Statement) jdbcConnection.createStatement();
		statement.executeUpdate("UPDATE personne set prenomPersonne='oo'");
		statement.close();
		DatabaseOperation.DELETE_ALL.execute(connection, dataSet);
		DatabaseOperation.INSERT.execute(connection, dataSet);
	}
}