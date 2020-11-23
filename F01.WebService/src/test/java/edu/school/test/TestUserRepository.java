package edu.school.test;

import edu.school.repository.UserRepository;

public class TestUserRepository {

    public static void main(String[]args){
        UserRepository us= new UserRepository();
        boolean status = us.isAuthorized("user-101","password1235");
        System.out.println("status: " +status);
    }

}
