package start;

import view.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    /*String url= "jdbc:postgresql://postgres@localhost:5432/Airline Reservations";
    String user = "postgres";
    String password = "Macranth1109";

    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return conn;

    }*/
    public static void main(String[] args){
        WelcomeWindow welcomeWindow = new WelcomeWindow();
        //welcomeWindow.setVisible(true);
        IntroduceUser introduceUser = new IntroduceUser();
        //introduceUser.setVisible(true);
        CreateAccount createAccount = new CreateAccount();
        //createAccount.setVisible(true);
        SelectFlightDetails selectFlight = new SelectFlightDetails();
        //selectFlight.setVisible(true);
        DisplayNoAvailableFlights displayNoAvailableFlights= new DisplayNoAvailableFlights();
        //displayNoAvailableFlights.setVisible(true);
        DisplayAvailableFlights displayAvailableFlights = new DisplayAvailableFlights();
        //displayAvailableFlights.setVisible(true);

        //Integer a = Integer.parseInt("abcd");
       // System.out.println(a);

    }

}
