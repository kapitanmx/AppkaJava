package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Logger {


    public static String name;
    public static String login;
    public static String surname;
    public static String address;
    public static String email;
    public static String password;
    public static int age;
    public static int zip_code;

    public void userRegister(String name, String surname, String login, String password, String address, String email, int age, int postal_code) {
        //logger logger = new logger();
        if (name.isEmpty() || surname.isEmpty() || address.isEmpty() || email.isEmpty())
            System.out.println("Nie wprowadzono danych. Sprobuj ponownie.");
        else {
            this.name = Logger.name;
            this.surname = Logger.surname;
            this.login = Logger.login;
            this.password = Logger.password;
            this.address = Logger.address;
            this.email = Logger.email;
            this.age = Logger.age;
            System.out.println("Stworzono użytkownika");
        }
    }

    public void userLogin(String login, String email, String password) {

        this.login = Logger.login;
        this.email = Logger.email;
        this.password = Logger.password;

        if (login.isEmpty() || email.isEmpty() || password.isEmpty())
            System.out.println("Uzupelnij dane");
        else if (login!=Logger.login)
            System.out.println("Niepoprawny login");
        else if (password!=Logger.password)
            System.out.println("Niepoprawne haslo!");
        else if (email!=Logger.email)
            System.out.println("Niepoprawny email");
        else{
            while(true){
                System.out.println();
            }
        }


    }

    public void userMod() {

    }

    public void userRemove() {

    }


    /*public static double validate(String str, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(str);
        String coeff = "+0";
        double value = 0;
        while (match.find()) {
            coeff = match.group(1);
            value = value + Double.parseDouble(coeff);
        }
        return (coeff.length() == 1) ? (value + 1) : value;
    }*/

    //UserData data = new UserData();

    public static void main(String[] args)
            throws IOException {

        Logger logger = new Logger();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int wybor;

        while (true) {
            System.out.println("Witaj w programie. dostępne operacje:");
            System.out.println("1 - Logowanie");
            System.out.println("2 - rejestracja");
            wybor = Integer.parseInt(br.readLine());
            switch(wybor){
                case 1:
                case 2:
            }
        }

    }
}
