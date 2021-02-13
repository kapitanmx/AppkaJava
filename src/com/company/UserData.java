package com.company;

public class UserData {

    private String name, surname, login, password, address, email;
    private int age, zip_code;

    public void setName(String newName){
        newName = Logger.name;
        this.name = newName;
    }

    public void setSurname(String newSurname){
        newSurname = Logger.surname;
        this.surname = newSurname;
    }

    public void setLogin(String newLogin){
        newLogin = Logger.login;
        this.login = newLogin;
    }

    public void setPassword(String newPassword){
        newPassword = Logger.password;
        this.password = newPassword;
    }

    public void setAddress(String newAddress){
        newAddress = Logger.address;
        this.address = newAddress;
    }

    public void setEmail(String newEmail){
        newEmail = Logger.email;
        this.email = newEmail;
    }

    public void setAge(int newAge){
        newAge = Logger.age;
        this.age = newAge;
    }

    public void setZipCode(int newZip){
        newZip = Logger.zip_code;
        this.zip_code = newZip;
    }



}
