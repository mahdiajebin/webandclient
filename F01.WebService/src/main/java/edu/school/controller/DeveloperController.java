package edu.school.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class DeveloperController {

    @GetMapping("/developer")

    public Map<String,Object> getDeveloperInfo(){
        Map<String,Object> map= new HashMap<>();
        map.put("developer","Sumyia, Rahman");
        map.put("experience","3");
        map.put("skills",new String[] {"SQL","C++","HTML"}) ;
      return map;
    }
}
