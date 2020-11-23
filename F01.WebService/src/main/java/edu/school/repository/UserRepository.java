package edu.school.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserRepository {
    final static String DB_URL = "jdbc:derby://localhost:1527/Fall2020S1";
    final static String SQL = "SELECT USERID, PASSWORD "
            + "FROM DEVELOPER.USERIDPASSWORD "
            + "WHERE USERID = ? ";

    public boolean isAuthorized(String userID, String password){
        boolean status = false;


        try (
                Connection conn= DriverManager.getConnection(DB_URL);
                PreparedStatement statement= conn.prepareStatement (SQL);
        ) {

            statement.setString(1, userID);

            ResultSet rs=statement.executeQuery();

            while(rs.next()){
                String dbPasswrod=rs.getString("PASSWORD");
                status=password.equals(dbPasswrod);
            }
        }
        catch (Exception ex){
            System.out.println("General Exception");
            ex.printStackTrace();
        }





        return status;
    }
}
