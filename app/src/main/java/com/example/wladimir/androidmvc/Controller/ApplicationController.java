package com.example.wladimir.androidmvc.Controller;

import android.app.Application;
import com.example.wladimir.androidmvc.Domain.User;
import java.util.ArrayList;
import java.util.List;

public class ApplicationController extends Application {

    private List<User> users;

    public  ApplicationController(){
        users=new ArrayList<User>();
        fillDateBases();
    }

    private void fillDateBases(){
        //Add users
        fillUsers();
    }

    private void fillUsers(){
        User person1=new User("Andres","Perez","estemanp","1234",24);
        users.add(person1);

        User person2=new User("Jessica","Ramirez","jessica","1234",16);
        users.add(person2);
    }

    public boolean isValidUser(String username, String password){
        Boolean resp=false;
        for (User person:users) {
            if(username.equals(person.getUserName())){
                if(password.equals(person.getPassword())){
                    resp=true;
                }
            }
        }
        return resp;
    }
}
