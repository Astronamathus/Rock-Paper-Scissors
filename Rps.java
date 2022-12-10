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
         int computer = (int)Math.floor(Math.random()*(3-1+1)+1);
         Scanner sc = new Scanner(System.in);
         for(int i = 1; i<=3; i++)
         {  
            System.out.println("------------------------------------------------------------");
            System.out.println("ROUND "+i);
            System.out.println("------------------------------------------------------------");
            System.out.println("Enter your choice (Rock (r), Paper (p) or Scissors (s)): ");
            c = sc.next().charAt(0);
            choice = (int)c;
            switch(choice)
            {
                 case 114:
                     System.out.println("You picked rock 🪨");
                     if(computer == 1)
                     {    
                         System.out.println("Computer picked rock 🪨");
                         System.out.println("This round is a tie");
                     }
                     if(computer == 2)
                     {
                         System.out.println("Computer picked paper 📄");
                         System.out.println("Computer wins this round!");
                         comp++;
                     }
                     if(computer == 3)
                     {
                         System.out.println("Computer picked scissors ✄");
                         System.out.println("You win this round!");
                         user++;   
                     }
                     break;
                 case 112:
                     System.out.println("You picked paper 📄");
                     if(computer == 1)
                     {
                         System.out.println("Computer picked rock 🪨");
                         System.out.println("You win this round!");
                         user++;   
                     }
                     if(computer == 2)
                     {
                         System.out.println("Computer picked paper 📄");
                         System.out.println("This round is a tie");   
                     }
                     if(computer == 3)
                     {
                         System.out.println("Computer picked scissors ✄");
                         System.out.println("Computer wins this round!");
                         comp++;   
                     }
                     break;
                 case 115:
                     System.out.println("You picked scissors ✄");
                     if(computer == 1)
                     {
                         System.out.println("Computer picked rock 🪨");
                         System.out.println("Computer wins this round!");
                         comp++;   
                     }
                     if(computer == 2)
                     {
                         System.out.println("Computer picked paper 📄");
                         System.out.println("You win this round!");
                         user++;
                     }
                     if(computer == 3)
                     {
                         System.out.println("Computer picked scissors ✄");
                         System.out.println("This round is a tie");   
                     }
                     break;
                 default:
                     System.out.println("Please enter only r, p or s");
            }
            System.out.println(" ");
            System.out.println("🆂🅲🅾🆁🅴:");
            System.out.print("You: ");
            System.out.println(user);
            System.out.print("Computer: ");
            System.out.println(comp);
         }
         if(comp>user)
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