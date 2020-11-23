package edu.school.test;

import edu.school.service.TooMuchWaterException;
import edu.school.service.WaterResource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestUserAndPassword {
    public static void main(String[] args) {
        final String DB_URL = "jdbc:derby://localhost:1527/Fall2020S1";
        final String SQL = "SELECT USERID, PASSWORD " +
                "FROM DEVELOPER.USERIDPASSWORD "
                + "WHERE USERID = ? ";
       try (
               Connection conn= DriverManager.getConnection(DB_URL);
            PreparedStatement statement= conn.prepareStatement (SQL);
        ) {

           statement.setString(1, "user-100");

           ResultSet rs=statement.executeQuery();

           while(rs.next()){
               System.out.format("uid: %s pwd: %s \n", rs.getString("USERID")
                                        , rs.getString("PASSWORD"));
           }
       }
       catch (Exception ex){
           System.out.println("General Exception");
           ex.printStackTrace();
       }
       }
    }

