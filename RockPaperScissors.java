import java.util.*;

public class RockPaperScissors
{   
   public String getUserChoice()
   {
      //build scanner for user input
      Scanner in = new Scanner (System.in);
      
      //variable for user choice
      String userChoice = "";
      
      //do while loop incase choice is invalid
      do
      {
         System.out.print("Rock, Paper, or Scissors?:");
         userChoice = in.nextLine();
         if (!(userChoice.equalsIgnoreCase("rock") || userChoice.equalsIgnoreCase("paper") || 
            userChoice.equalsIgnoreCase("scissors")))   
         {   
            System.out.println("Sorry, \"" + userChoice + "\" is not a valid entry.");
         }
       }while (!(userChoice.equalsIgnoreCase("rock") || userChoice.equalsIgnoreCase("paper") || 
              userChoice.equalsIgnoreCase("scissors")));        
       
       //returning the user option
       return userChoice;
   }
   
   public String getCPUChoice()
   {
      Random r = new Random();
      
      String cpuChoice = "";
      //String array for computer options
      String[] options = {"Rock", "Paper", "Scissors"}; 
      
      //to find the index in the array
      int idx = r.nextInt(options.length);
      
      //convert array index to cpu choice
      cpuChoice = options[idx];
      
      System.out.println(cpuChoice);
      
      //returning the cpu choice
      return cpuChoice;   
   }
   
   public int pickWinner(String userChoice, String cpuChoice)
   {
      int winner = 0;
      
      //if user wins
      if ((userChoice.equalsIgnoreCase("rock") && cpuChoice.equalsIgnoreCase("scissors")) ||
          (userChoice.equalsIgnoreCase("paper") && cpuChoice.equalsIgnoreCase("rock")) ||
          (userChoice.equalsIgnoreCase("scissors") && cpuChoice.equalsIgnoreCase("paper")))
          {
            winner = 1;
          }
      //if cpu wins
      else if ((userChoice.equalsIgnoreCase("rock") && cpuChoice.equalsIgnoreCase("paper")) ||
               (userChoice.equalsIgnoreCase("paper") && cpuChoice.equalsIgnoreCase("scissors")) ||
               (userChoice.equalsIgnoreCase("scissors") && cpuChoice.equalsIgnoreCase("rock")))
          {
            winner = 2;
          }
      //tie
      else
         {
            winner = 0;
         }      
      return winner;      
   }
}//end class