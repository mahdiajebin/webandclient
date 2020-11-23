package edu.school.repository;

import edu.school.Model.Car;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CarRepository {

    final static String SQL = " SELECT NAME, INCOME "
            + " FROM DEVELOPER.EXPENSIVECARS ";
    final static String DB_URL = "jdbc:derby://localhost:1527/Fall2020S1";

    public List<Car> findAll(){
        List<Car> carList=new ArrayList<>();
        try (
                Connection conn= DriverManager.getConnection(DB_URL);
                PreparedStatement statement= conn.prepareStatement (SQL);){

            ResultSet rs=statement.executeQuery();
            while(rs.next()){
                String name=rs.getString("NAME");
                double price=rs.getDouble("INCOME");
                Car c=new Car (name, price);
                carList.add(c);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }





        return carList;
    }
}
