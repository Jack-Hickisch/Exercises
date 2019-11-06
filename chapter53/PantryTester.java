public class PantryTester
{
  public static void main ( String[] args )
  {
    Jam goose = new Jam( "Gooseberry", "7/4/86", 12 );
    Jam apple = new Jam( "Crab Apple", "9/30/99", 8 );
    Jam rhub  = new Jam( "Rhubarb", "10/31/99", 3 );

    Pantry hubbard = new Pantry( goose, apple, rhub );
    System.out.println( hubbard );

    hubbard.select(1);
    hubbard.spread(2);
    System.out.println( hubbard );

    hubbard.select(3);
    hubbard.spread(4);
    System.out.println( hubbard );
  }
}