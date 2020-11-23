package edu.school.controller;

import edu.school.Model.Car;
import edu.school.Model.DataModel;
//import jdk.jfr.DataAmount;
import edu.school.repository.CarRepository;
import edu.school.repository.SalesRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CarSalesController {


    SalesRepository repository = new SalesRepository();


    @GetMapping("/db/monthlysales")

    List<DataModel> getCarSales(){
        List<DataModel> sales = repository.findAll();


        return sales;
    }





//    @GetMapping("/design/monthlysales")


//    List<DataModel> getCarSales(){
//
//        DataModel sale1 =  new DataModel(" ", 60_061d);
//        DataModel sale2 =  new DataModel("Feb", 12_113d);
//        DataModel sale3 =  new DataModel("Mar", 14_7282d);
//        DataModel sale4 =  new DataModel("Apr.", 79_106d);
//        DataModel sale5 =  new DataModel("May", 17_2788d);
//        DataModel sale6 =  new DataModel("Jun", 11_8845d);
//        DataModel sale7 =  new DataModel("Jul", 17_4888d);
//        DataModel sale8 =  new DataModel("Aug", 67_210d);
//        DataModel sale9=   new DataModel("Sep", 12_0220d);
//        DataModel sale10 =  new DataModel("Oct", 19_0218d);
//        DataModel sale11 =  new DataModel("Nov", 13_9784d);
//        DataModel sale12 =  new DataModel("Dec", 18_4206d);
//
//
//        List<DataModel> sales  = Arrays.asList(sale1, sale2, sale3, sale4, sale5, sale6, sale7, sale8, sale9, sale10,sale11,sale12);
//
//        return sales;
//    }



}
