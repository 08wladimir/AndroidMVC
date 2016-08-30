package com.example.wladimir.androidmvc.Controller;

import java.util.ArrayList;
import java.util.List;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import com.example.wladimir.androidmvc.Domain.User;
import com.example.wladimir.androidmvc.View.LandingActivity;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by Wladimir on 27/08/2016.
 */

public class AppController {
    private static AppController _instance;
    private static List<User> users;

    public static AppController getInstance() {
        if (_instance == null) {
            _instance = new AppController();
            users = new ArrayList<>();
        }
        return _instance;
    }

    public void llenar (String nombre, String apelllido,  String usuario,  String password, int edad) {
        fillDateBases(nombre, apelllido, usuario, password, edad);
    }

    private void fillDateBases(String nombre, String apelllido,  String usuario,  String password, int edad) {
        //Add users
        fillUsers(nombre, apelllido, usuario, password, edad);
    }

    private void fillUsers(String nombre, String apelllido,  String usuario,  String password, int edad) {
        User person1 = new User(nombre, apelllido, usuario, password, edad);
        users.add(person1);

    }

    public boolean isValidUser(String username, String password) {
        Boolean resp = false;
        for (User person : users) {
            if (username.equals(person.getUserName())) {
                if (password.equals(person.getPassword())) {
                    resp = true;
                }
            }
        }
        return resp;
    }

    public boolean IsValidPass(String password, String confpassword) {
        Boolean resp = false;
        if (password.equals(confpassword)) {
            resp = true;
        }
        return resp;
    }

}