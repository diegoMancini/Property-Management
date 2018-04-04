package tryout;

import user.Owner;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

   private static final String JDBC_DRIVER = "org.postgresql.Driver";
   private static final String DB_URL = "jdbc:postgresql://35.199.126.247:5432/usersdb";
   private static final String USER = "Diegonfx";
   private static final String PASS = "Perrito1";

   public static void main(String[] args) throws ClassNotFoundException, SQLException {

      Connection conn = null;
      try {
         Class.forName(JDBC_DRIVER);
         conn = DriverManager.getConnection(DB_URL, USER, PASS);
      } catch (Exception e) {
         e.printStackTrace();
         System.err.println(e.getClass().getName() + ": " + e.getMessage());

      }

//      List<Owner> owners = new ArrayList<Owner>();
//      for (int i = 1; i < 11; i++) {
//         owners.add(new Owner("100" + i, "Owner" + i, "", "person" + i + "@mail.com", "100" + i, "0800" + i));
//      }
//      for (int i = 0; i < owners.size(); i++) {
//         System.out.println("Owner: " + owners.get(i).getName() + " ---> ID: " + owners.get(i).getId());
//      }

      Statement stmt = null;
      try {
         //STEP 4: Execute a query
         System.out.println("Inserting records into the table...");
         assert conn != null;
         stmt = conn.createStatement();

         String sql = "INSERT INTO users " +
                 "VALUES ('Nicole', 'Ghirlanda', 'nicole_ghirlanda@hotmail.com','Perrito1','549113598893', '38891542')";
         stmt.executeUpdate(sql);
         String insert = "INSERT INTO users values(?,?,?,?,?,?)";
         PreparedStatement ps = conn.prepareStatement(insert);

//         for (int i = 0; i < owners.size(); i++) {
//            ps.setString(1, owners.get(i).getName());
//            ps.setString(2, owners.get(i).getSurname());
//            ps.setString(3, owners.get(i).getEmail());
//            ps.setString(4, owners.get(i).getPassword());
//            ps.setString(5, owners.get(i).getPhone());
//            ps.setString(6, owners.get(i).getId());
//            ps.addBatch();
//         }
//         ps.executeBatch();

         System.out.println("Inserted records into the table...");

      } catch (Exception e) {
         //Handle errors for Class.forName
         e.printStackTrace();
      } finally {
         //finally block used to close resources
         try {
            if (stmt != null)
               conn.close();
         } catch (SQLException ignored) {
         }// do nothing
         try {
            if (conn != null)
               conn.close();
         } catch (SQLException se) {
            se.printStackTrace();
         }//end finally try
      }//end try
      System.out.println("Goodbye!");
   }
}