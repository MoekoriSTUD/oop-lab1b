 OOP Lab 1: Java Book Tracker 

## Description
A simple program to track books that has a class Book and methods like displayDetails for the book and borrowBook to mark this book as a borrowed.
 
## Run 
Open the project in IntelliJ with JDK 24 and run Main.java. 
 
 
## Object model 
Book defines an object of a book with all the "template" variables.
firstBook is an instance of a Book class.
displayDetails displays info about a book such as title, author, page number and availability.
borrowBook just marks a specified book as borrowed and toggles the availability if the value was true.

## Example run
First Book: Dune
First Book Author: Frank
First Book PageCount: 412
First Book Available? true


Dune borrowed successfully
Book: Dune
Book Author: Frank
Book PageCount: 412
Is Book Available? false


Second Book: 
Book: Star Trek
Book Author: Dave
Book PageCount: 300
Is Book Available? true

Process finished with exit code 0

## Why create book is separate from main?
Because only one public class can be created in one file.

## How borrowBook() changes object state?
It checks if a specified books availability is true and if its true, the method just sets it to false and prints a confirmation of it.

## Any material
None
 
## Verification 
Describe one successful run in your own words.

When the run is successful, it should print a title, author, page count and availability of the first book, that it should say that the book is borrowed successfully and all the info about the book after it being borrowed 
(which basically just a change of its availability status). And after that it displays all the info about the seconds book. At the end there should be a text saying that the process finished with exit code 0 
(which means no errors)
