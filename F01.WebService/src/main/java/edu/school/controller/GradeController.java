package edu.school.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class GradeController {

    @GetMapping("/grade/midsemester/{score}")

    public Map<String,Object> getMidGrade(@PathVariable Float score){
        Map<String,Object>map=new HashMap<>();
        String status ="Failing";
        if (score>=65)
            status="Passing";
        map.put("status",status);
        map.put("score",score);
        return map;
    }
}
