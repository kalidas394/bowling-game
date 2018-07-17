# bowling-game

Problem Statement:

Write a program that takes as input an array of integers representing a complete 10-pin bowling game, 
where each int represents the number of pins knocked down by a single roll, and outputs the score for the game.

Implementation details:

A simple java implementation, that takes the number of pins as integer arguments from command line and 
prints the total score.

Compiling & running details:

  1. navigate to the src folder, realtive path: /BowlingScore/src/com/kalidas/game/ and run the following command:
               javac *.jar

  2. create manifest file specifying the main class using the following command:
               echo Main-Class: GameScore > manifest.txt
   
  3. create a jar file using the following command:
                jar cfm bowling-score.jar manifest.txt *.class 
 
  4. Run the jar file using the following command and pass the integer array values as individual arguments
                java -jar bowling-score.jar args1 args2 ...
                    
					
					
Sample Input:

java -jar bowling-score.jar 10 7 3 6 4 8 2 6 3 4 1 6 2 10 10 10 10 10

Sample Output:

182
  

The project can also be loaded into Eclipse IDE and can be executed as a java application.

Have also attached a runnable jar of the implementation