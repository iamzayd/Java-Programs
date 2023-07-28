The assignment consists of two parts, each with its own Java file.

Part 1 - Factorial Calculation As8_part1.java is a Java program that calculates the factorial of a number provided as a command-line argument. The program checks if the input value is between 1 and 10, inclusive. If the value is out of range or not a valid integer, the program throws a custom exception called MyExcep. The program also catches a NumberFormatException in case the command-line argument is not a valid integer. The factorial is calculated using a separate method called factorial.

Part 2 - String Matching As8_part2.java is a Java program that prompts the user to enter a string and checks if it matches the word "India". If the input does not match, the program throws a custom exception called NOMATCHEXCP and displays an error message indicating the line number where the user input is taken.

Both programs demonstrate the use of custom exceptions and exception handling in Java.

Running the Programs To run the programs, make sure you have Java installed on your system. Compile the Java files using the following commands:

Copy code javac As8_part1.java javac As8_part2.java To run As8_part1, provide an integer value between 1 and 10 as a command-line argument:

Copy code java As8_part1 5 To run As8_part2, simply run the program:

Copy code java As8_part2
