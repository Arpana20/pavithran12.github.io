/*jdbc - java handling the database
driver - interface between the java and database
opensource database connectivity - works as common database.
4types of drivers
->JDBC-ODBC bridge driver
->native-API driver(partially java driver)
->Network Protocol driver(fully java driver)
  updations needed.
  complex as need of Network all the time.
->Thin Driver (fully java Driver)
  making the driver available at the particular program.
  it is also called as connector
  A JAR (Java ARchive) is a package file format typically used to aggregate many Java class files and associated metadata and resources (text, images, etc.) into one file for distribution
  there is also executable jar 's;
  https://dev.mysql.com/doc/connector-j/5.1/en/connector-j-installing.html
  
  ->Steps to install the java packages
  import required packages SQL packages
  register the jdbc driver
  open a connection
  execute a query
  extract data from resultset
  cleanup the environment
  ->classes
  Connection class
  Statement
  Result set
  
  
  
  
  
  
  
  Step1: Download this
  http://www.java2s.com/Code/Jar/m/Downloadmysqlconnectorjava5123binjar.htm
  Step2:  Open Xamp
  Step3: create a database
  Step4: Start a java program.
  Step5:Build path -> in Eclipse
        Add external jars
        //referenced library will be available
  Step6:after certain amount of code create connection.
        connection interface will be available.
*/

//jdbc java data base connections
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
public class jdbc {

		public static void main(String[] args) {
			String userName="";
			String passWord="";
			String DBurl="jdbc:mysql://localhost/email verify";
			//as database will not be in the same system all time
			String query="Select * from email verify";
			Connection dbConnection = null;
			Statement stmtToBeExecuted = null;
			ResultSet results = null;
			
			//exception because many possibilities arrive due to database
			try {
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("Load Done");
			} catch (ClassNotFoundException e) {
				
				System.out.println("Load Problem");
			}
			//to create a connection
			//getconnection static method from driver class
			try {
				dbConnection =(Connection) DriverManager.getConnection(DBurl,passWord,userName);
				System.out.println("Connected");
			} catch (SQLException e) {
				System.out.println("Connection prob");
			}
			
			//statement object is referenced
			try {
				stmtToBeExecuted= (Statement)dbConnection.createStatement();
				System.out.println("Statement Done");
			} catch (SQLException e) {
				System.out.println("Statement Problem");
			}
			
			//results
			try {
				results=stmtToBeExecuted.executeQuery(query);
				System.out.println("Result Obtained");
			} catch (SQLException e) {
				System.out.println("Result not Obtained");
			}
			
			// to process result set
			//getString(pos)
			try {
				while(results.next()){
					System.out.println(results.getString(1));
					System.out.println(results.getString(2));
				}
				System.out.println("Result reading Obtained");
			} catch (SQLException e) {
				System.out.println("Result reading not Obtained");
			}
		}
		
}
// ? can be replaced by values.
//PreparedStatement stmt=con.prepareStatement("insert into emp values(?,?)")
