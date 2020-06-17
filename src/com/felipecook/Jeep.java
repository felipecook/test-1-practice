package com.felipecook;

public class Jeep extends Car{


  public Jeep() {

  }

  public Jeep(String color, String model, int numberOfWheels) {
    this.setColor(color);
    this.setModel(model);
    this.setNumberOfWheels(numberOfWheels);
  }

  @Override
  public void drive() {
    super.drive();
    System.out.println("Jeep goes vroom");
  }


  public void transport() {
    System.out.println("Jeep is transporting");
  }

  public void transport(int numberOfPeople){
    System.out.println("Jeep is transporting " + numberOfPeople + " people.");
  }

  public void transport(int numberOfPeople, String destination){
    System.out.println("Jeep is transporting " + numberOfPeople + " people. To the " + destination + ".");
  }


}
