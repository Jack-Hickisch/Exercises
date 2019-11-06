import java.util.Scanner;

public class Exercise1
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Welcome to Mother Hubbard's Pantry!\n");

    Jam gooseberry = new Jam("Gooseberry", "7/4/86", 12);
    Jam crabApple = new Jam("Crab Apple", "9/30/99", 8);
    Jam rhubarb = new Jam("Rhubarb", "10/31/99", 16);

    for (boolean keepUsing = true; keepUsing;)
    {
      int selection = 0;
      int spread = 0;

      System.out.println("1: " + gooseberry.toString());
      System.out.println("2: " + crabApple.toString());
      System.out.println("3: " + rhubarb.toString());

      System.out.println("Enter your selection (1, 2, or 3):");
      selection = scan.nextInt();

      if (selection != 1 && selection != 2 && selection != 3)
      {
        System.out.println("Good-by");
        keepUsing = false;
      }
      else
      {
        System.out.println("Enter amount to spread:");
        spread = scan.nextInt();

        if (gooseberry.getCapacity() == 0)
        {
          System.out.println("No jam in the Jar!");
        }
        else
        {
          if (selection == 1)
          {
            if (gooseberry.getCapacity() >= spread)
            {
              System.out.println("Spreading " + spread + " fluid ounces of Gooseberry\n");
              gooseberry.subtractCapacity(spread);
            }
            else
            {
              System.out.println("Spreading " + gooseberry.getCapacity() + " fluid ounces of Gooseberry\n");
              gooseberry.setCapacity(0);
            }
          }
        }
  
        if (crabApple.getCapacity() == 0)
        {
          System.out.println("No jam in the Jar!");
        }
        else
        {
          if (selection == 2)
          {
            if (crabApple.getCapacity() >= spread)
            {
              System.out.println("Spreading " + spread + " fluid ounces of Crab Apple\n");
              crabApple.subtractCapacity(spread);
            }
            else
            {
              System.out.println("Spreading " + crabApple.getCapacity() + " fluid ounces of Crab Apple\n");
              crabApple.setCapacity(0);
            }
          }
        }
  
        if (rhubarb.getCapacity() == 0)
        {
          System.out.println("No jam in the Jar!");
        }
        else
        {
          if (selection == 3)
          {
            if (rhubarb.getCapacity() >= spread)
            {
              System.out.println("Spreading " + spread + " fluid ounces of Rhubarb\n");
              rhubarb.subtractCapacity(spread);
            }
            else
            {
              System.out.println("Spreading " + rhubarb.getCapacity() + " fluid ounces of Rhubarb\n");
              rhubarb.setCapacity(0);
            }
          }
        }
      }
    }
  }
}