package com.felipecook;

public class Main {


  public static void main(String[] args) {

    Jeep levisJeep = new Jeep();
    
    levisJeep.drive();
    // System.out.println("The current number of wheels on Levi's Jeep is: " + levisJeep.getNumberOfWheels());

    levisJeep.transport();

    levisJeep.transport(5);

    levisJeep.transport(5, "Paris");

    Jeep levisSecondJeep = new Jeep("Purple", "Wrangler", 5);

    System.out.println(levisSecondJeep.getNumberOfWheels());
    System.out.println(levisSecondJeep.getColor());
    System.out.println(levisSecondJeep.getModel());
  }

}
