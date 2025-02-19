package com.json.practiceproblems.objecttojson;

public class Car {
    int carId;
    String carModel;
    double price;
    String launchDate;

    //Constructor to initialize
    Car(int carId , String carModel, double price , String launchDate){
        this.carId = carId;
        this.carModel = carModel;
        this.price = price;
        this.launchDate = launchDate;
    }

    public int getCarId() {
        return carId;
    }

    public String getCarModel() {
        return carModel;
    }

    public double getPrice() {
        return price;
    }

    public String getLaunchDate() {
        return launchDate;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carId=" + carId +
                ", carModel='" + carModel + '\'' +
                ", price=" + price +
                ", launchDate='" + launchDate + '\'' +
                '}';
    }
}
