You are asked to design a vehicle management system using inheritance, polymorphism, and the use of interfaces.
In this exercise, you will model a class hierarchy that represents different types of vehicles and their behaviors, 
allowing the creation and management of various types of vehicles with unique capabilities.

Requirements:
Movable Interface:

Define an interface called Movable that declares a method move(), which will represent the movement behavior of a vehicle.
Base Class Vehicle:

Create an abstract base class called Vehicle that has the following attributes:
brand (type String): the brand of the vehicle.
model (type String): the model of the vehicle.
year (type int): the year of manufacture of the vehicle.
The class should have a constructor that initializes the mentioned attributes.
It must implement the Movable interface but leave the move() method as abstract so that derived classes implement it.
The Vehicle class should also have a method called showInfo() that prints the brand, model, and year of the vehicle.
Derived Classes:

Create two classes that inherit from Vehicle:
Car:
Implement the move() method to print "The car is moving.".
Add an additional attribute called numDoors (type int) that represents the number of doors of the car. 
Make sure to initialize it in the constructor.
Override the showInfo() method to also print the number of doors.
Motorcycle:
Implement the move() method to print "The motorcycle is moving.".
Add an additional attribute called engineCapacity (type int) that represents the engine capacity of the motorcycle.
Make sure to initialize it in the constructor.
Override the showInfo() method to also print the engine capacity.
Garage Class:

Create a class called Garage that manages a collection of vehicles. This class should have the following methods:
addVehicle(Vehicle vehicle): this method should add a vehicle to a static list of up to 5 vehicles.
showVehicles(): this method should loop through the list and call the showInfo() method of each vehicle.
moveAll(): this method should loop through the list and call the move() method of each vehicle, showing how each vehicle moves.
Main Class:

In the main Main class, perform the following actions:
Create a Garage.
Create multiple objects of type Car and Motorcycle.
Use the addVehicle() method to add vehicles to the garage.
Call the showVehicles() and moveAll() methods to display the information and movement of each vehicle.
In the Main class show a menu that allow to choose one of these options:

                                    --- Vehicle Management System ---
                                         1. Add a Car
                                         2. Add a Motorcycle"
                                         3. Show all vehicles in the garage.
                                         4. Move all vehicles.
                                         5. Exit.
