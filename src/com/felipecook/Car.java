package com.felipecook;

public class Car {

  private int numberOfWheels = 4;
  private String color = "blue";
  private String model = "prius";

  public Car() {
    System.out.println("constructor for car is constructing");
  }

  public void drive(){
    System.out.println("Car is driving");

  }

  public int getNumberOfWheels() {
    return numberOfWheels;
  }

  public void setNumberOfWheels(int numberOfWheels) {
    this.numberOfWheels = numberOfWheels;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }
}
