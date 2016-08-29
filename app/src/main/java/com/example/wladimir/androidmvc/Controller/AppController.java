package com.example.wladimir.androidmvc.Controller;

import com.example.wladimir.androidmvc.Domain.User;
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

    public void llenar (String nombre, String apelllido,  String usuario,  String contraseña, int edad) {
        fillDateBases(nombre, apelllido, usuario, contraseña, edad);
    }

    private void fillDateBases(String nombre, String apelllido,  String usuario,  String contraseña, int edad) {
        //Add users
        fillUsers(nombre, apelllido, usuario, contraseña, edad);
    }

    private void fillUsers(String nombre, String apelllido,  String usuario,  String contraseña, int edad) {
        User person1 = new User(nombre, apelllido, usuario, contraseña, edad);
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

    public boolean IsValidPass(String contraseña, String ccontraseña) {
        Boolean resp = false;
        if (contraseña.equals(ccontraseña)) {
            resp = true;
        }
        return resp;
    }

}