package edu.school.repository;

import edu.school.Model.Car;
import edu.school.Model.DataModel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class SalesRepository {

    final static String SQL = " SELECT PURCHASEMONTH, PRICEPAID "
            + " FROM DEVELOPER.SALESBYMONTH ";
    final static String DB_URL = "jdbc:derby://localhost:1527/Fall2020S1";

    public List<DataModel> findAll(){
        List<DataModel> CarSales = new ArrayList<>();
        try (
                Connection conn= DriverManager.getConnection(DB_URL);
                PreparedStatement statement= conn.prepareStatement (SQL);){

            ResultSet rs=statement.executeQuery();

            while(rs.next()){
                String month = rs.getString("PURCHASEMONTH");
                double value = rs.getDouble("PRICEPAID");
                DataModel c = new DataModel (month, value);
                CarSales.add(c);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

        return CarSales;
    }
}
