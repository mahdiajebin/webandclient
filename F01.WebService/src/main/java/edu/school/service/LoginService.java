package edu.school.service;

import edu.school.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
@Service
public class LoginService {
    Map<String,String>users=new HashMap<>();
    UserRepository repository=new UserRepository();

 public  LoginService(){
     System.out.println("Login service is live " + new Date());
     users.put("parker","pwd1234");
     users.put("stark","pwd1234");
     users.put("rogers","pwd1234");
 }
    public boolean getUserInfo(String userID, String password) {
        boolean status = repository.isAuthorized(userID, password);
        return status;
    }
    public boolean _getUserInfo(String userID, String password){
     boolean doesExists = users.containsKey(userID);
     if (doesExists){
         String pwd=users.get(userID);
         if (pwd.equals(password)){

         }
     }
     return false;
    }
}
