import java.util.*;
public class Rps
{
    public static void main()
    {
         char c;
         int choice;
         int round;
         int comp = 0;
         int user = 0;
         Scanner sc = new Scanner(System.in);
         for(int i = 1; i<=3; i++) // Three rounds to increase your chances of not losing against a computer
         {  
            int computer = (int)Math.floor(Math.random()*(3-1+1)+1);  // Picks a random number between 1 and 3 each time the loop runs
            System.out.println("------------------------------------------------------------");
            System.out.println("ROUND "+i);
            System.out.println("------------------------------------------------------------");
            System.out.println("Enter your choice (Rock (r), Paper (p) or Scissors (s)): ");
            c = sc.next().charAt(0);
            choice = (int)c; //Typecasts char input by user to int because char is annoying in a switch case
            switch(choice)
            {
                 case 114:    //114 is the ASCII value of 'r'
                     System.out.println("You picked rock 🪨");
                     if(computer == 1) //Output if computer picks rock
                     {    
                         System.out.println("Computer picked rock 🪨");
                         System.out.println("This round is a tie");
                     }
                     else if(computer == 2) //Output if computer picks paper
                     {
                         System.out.println("Computer picked paper 📄");
                         System.out.println("Computer wins this round!");
                         comp++; // Gives computer a point for winning this round
                     }
                     else if(computer == 3) //Output if computer picks scissors
                     {
                         System.out.println("Computer picked scissors ✄");
                         System.out.println("You win this round!");
                         user++;   // Gives user a point for winning this round
                     }
                     break;
                 case 112:    //112 is the ASCII value of 'p'
                     System.out.println("You picked paper 📄");
                     if(computer == 1)
                     {
                         System.out.println("Computer picked rock 🪨");
                         System.out.println("You win this round!");
                         user++;   
                     }
                     else if(computer == 2)
                     {
                         System.out.println("Computer picked paper 📄");
                         System.out.println("This round is a tie");   
                     }
                     else if(computer == 3)
                     {
                         System.out.println("Computer picked scissors ✄");
                         System.out.println("Computer wins this round!");
                         comp++;   
                     }
                     break;
                 case 115:      //115 is the ASCII value of 's'
                     System.out.println("You picked scissors ✄");
                     if(computer == 1)
                     {
                         System.out.println("Computer picked rock 🪨");
                         System.out.println("Computer wins this round!");
                         comp++;   
                     }
                     else if(computer == 2)
                     {
                         System.out.println("Computer picked paper 📄");
                         System.out.println("You win this round!");
                         user++;
                     }
                     else if(computer == 3)
                     {
                         System.out.println("Computer picked scissors ✄");
                         System.out.println("This round is a tie");   
                     }
                     break;
                 default: // For people who can't read instructions
                     System.out.println("Please enter only r, p or s");
            }
            System.out.println(" ");
            System.out.println("ⓈⒸⓄⓇⒺ:");
            System.out.print("You: "); 
            System.out.println(user); //Your score
            System.out.print("Computer: ");
            System.out.println(comp); //Computer's score
         }
         if(comp>user) // Determines the winner
         {
             System.out.println("COMPUTER WINS");  
         }
         else if(user>comp)
         {
             System.out.println("YOU WIN");   
         }
         else
         {
             System.out.println("It is a tie.");  
         }
    }
}
