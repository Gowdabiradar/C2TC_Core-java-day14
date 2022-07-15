package com.acharya.polymerism;

class Bike
{
void run()
{
System.out.println("Vehicle is Running");
}
}
class Bike2 extends Bike
{
void run()
{
System.out.println("Bike is running safely");
}
}
public class Ex3 {

public static void main(String[] args) {
Bike b=new Bike2();
b.run();

}

}