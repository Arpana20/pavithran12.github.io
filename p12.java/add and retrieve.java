//jdbc java data base connections
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
public class jdbc {
            public static void main(String[] args) throws Exception{
                    String userName="root";
                    String passWord="";
                    String DBurl="jdbc:mysql://localhost/p12-j";
                    //as database will not be in the same system all time
                    //String query="INSERT INTO `db1`(`Name`,`Ph.no`,`Email`) VALUES('nivi',12345678901,'nivi@gmail.com')";
                    String query ="DELETE FROM `db1` WHERE Name ='shiva'";
                    String qry="Select * from db1";
                    Connection dbConnection = null;
                    Statement stmtToBeExecuted = null;
                    ResultSet results = null;
                    PreparedStatement preStmt=null;
                    //exception because many possibilities arrive due to database
                    Class.forName("com.mysql.jdbc.Driver");
                  
                    //to create a connection
                    //get connection static method from driver class
                   dbConnection =(Connection) DriverManager.getConnection(DBurl,userName,passWord);
                           

                    //statement object is referenced
                   stmtToBeExecuted= (Statement)dbConnection.createStatement()  ;
                         

                    Scanner in = new Scanner(System.in);
                    System.out.println("Enter the details...");
                    
                    //inserting using prepared statement
                  preStmt=(PreparedStatement) dbConnection.prepareStatement("INSERT INTO `db1`(`Name`, `Ph.no`, `Email`) VALUES (?,?,?)");
					
                    preStmt.setString(1,"shiva");
                    preStmt.setInt(2, 3543546);
                    preStmt.setString(3,"shiva@gmail.com");
                    preStmt.execute();
                    /*String query="INSERT INTO `db1`(`Name`,`Ph.no`,`Email`) VALUES('"+in.next()+"',"+in.nextInt()+",'"+in.next()+"')";

                    try {
                        stmtToBeExecuted.executeUpdate(query);
                           System.out.println("Inserted successfully");
                    } catch (SQLException e1) {
                         System.out.println("Not Inserted ");
                    }
                     */
                    stmtToBeExecuted.executeUpdate(query);
                    //results
                    results=stmtToBeExecuted.executeQuery(qry);
                     

                    // to process result set
                    //getString(pos)
                            while(results.next()){
                                    System.out.println(results.getString(1));
                                    System.out.println(results.getString(2));
                                    System.out.println(results.getString(3));
                            
                            	}
            }
}