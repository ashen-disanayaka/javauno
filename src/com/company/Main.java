package com.company;

public class Main {

    public static void main(String[] args) {
        Car car =new Car("bmw","saloon",2001,700);
        double bmw = car.car_condition();

        System.out.println("car condition : "+ bmw);


    }


}
