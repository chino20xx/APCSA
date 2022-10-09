public class Main {
   public static void main(String[] args)
   {
     // Get a random number from 1 to 8
 int rand= (int)(Math.random() * 8);
     // Use if statements to test the random number
    
     // and print out 1 of 8 random responses
 switch(rand) {
      
      case 0:
      System.out.println("It is certain");
      break;
      case 1:
      System.out.println("Most likely");
      break;
      case 2:
      System.out.println("My reply is no");
      break;
      case 3:
      System.out.println("My sources say no");
      break;
      case 4:
      System.out.println("Ask again later");
      break;
      case 5:
      System.out.println("Signs point to yes");
      break;
      case 6:
      System.out.println("Don't count on it");
      break;
      case 7:
      System.out.println("Without a doubt");
      break;
      default: 
      System.out.println("Reply hazy, try again");
      break;
    }

   }
}
