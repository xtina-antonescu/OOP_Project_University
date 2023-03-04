package model;

public class Flight {
    private int flight_id;
    private int flight_day;
    private int flight_month;
    private int flight_year;
    private String departure_city;
    private String destination_city;
    private int seats_economy;
    private int seats_business;
    private int price_economy;
    private int price_business;

    public Flight(int flight_id, int flight_day, int flight_month, int flight_year, String departure_city, String destination_city, int seats_economy, int seats_business, int price_economy, int price_business ){
        this.flight_id=flight_id;
        this.flight_day=flight_day;
        this.flight_month=flight_month;
        this.flight_year=flight_year;
        this.departure_city=departure_city;
        this.destination_city=destination_city;
        this.seats_economy=seats_economy;
        this.seats_business=seats_business;
        this.price_economy=price_economy;
        this.price_business=price_business;
    }

    public int getFlight_id() {
        return flight_id;
    }

    public void setFlight_id(int flight_id) {
        this.flight_id = flight_id;
    }

    public int getFlight_day() {
        return flight_day;
    }

    public void setFlight_day(int flight_day) {
        this.flight_day = flight_day;
    }

    public int getFlight_month() {
        return flight_month;
    }

    public void setFlight_month(int flight_month) {
        this.flight_month = flight_month;
    }

    public int getFlight_year() {
        return flight_year;
    }

    public void setFlight_year(int flight_year) {
        this.flight_year = flight_year;
    }

    public String getDeparture_city() {
        return departure_city;
    }

    public void setDeparture_city(String departure_city) {
        this.departure_city = departure_city;
    }

    public String getDestination_city() {
        return destination_city;
    }

    public void setDestination_city(String destination_city) {
        this.destination_city = destination_city;
    }

    public int getSeats_economy() {
        return seats_economy;
    }

    public void setSeats_economy(int seats_economy) {
        this.seats_economy = seats_economy;
    }

    public int getSeats_business() {
        return seats_business;
    }

    public void setSeats_business(int seats_business) {
        this.seats_business = seats_business;
    }

    public int getPrice_economy() {
        return price_economy;
    }

    public void setPrice_economy(int price_economy) {
        this.price_economy = price_economy;
    }

    public int getPrice_business() {
        return price_business;
    }

    public void setPrice_business(int price_business) {
        this.price_business = price_business;
    }
}
