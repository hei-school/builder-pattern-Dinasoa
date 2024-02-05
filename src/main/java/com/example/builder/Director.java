package com.example.builder;

public class Director {
    public void makeSUV(Builder builder){
        builder.reset();
        builder.setSeats(5);
        builder.setEngine("V8");
        builder.setTripComputer(true);
        builder.setGps(true);
    }

    public void makeSportsCard(Builder builder){
        builder.reset();
        builder.setSeats(7);
        builder.setEngine("V8");
        builder.setTripComputer(true);
        builder.setGps(true);
    }
}
