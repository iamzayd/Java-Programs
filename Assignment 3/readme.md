This is the directory for Assignment 3:-Student_Data_Array_of_Objects It contains three files:

Main.java
Student.java
Operations.java
Operations.java contains Operations class with following three methods:

addStudent(): This is the method used to add student details in Student object which instead will be stored in an array.
displayStudents(): This is the method which display all the Student object stored in an array.
searchByPrn(): This is the method used to search student by their PRN from the array in which Student objects are stored.
searchByName(): This is the method used to search student by their Name from the array in which Student objects are stored.
searchByIndex(): This is the method used to search student by the index from the array in which Student objects are stored.
edit(): This is the method used to edit student details by searching particular student using their name from the array in which Student objects are stored.
delete(): This is the method used to delete a Student object by searching particular student using their name from the array in which Student objects are stored.
Student.java contains InputUser class with following methods:

It contains getter and setter methods for all the private variables like prn, name, dob and marks stored in a single Student object.
It also contains parameterized constructor with all the variables prn, name, dob and marks.
Main.java contains Main class with following methods:

It contains switch case where user is allowed to enter a character for particular operations.
It contains main method inside which there's switch case for menu to select operations among Add Student, Display, Search(by prn), Search(by name), Search(by position), Edit Details and Delete.
Main method catches the returned values from different methods of Operations class and display them
