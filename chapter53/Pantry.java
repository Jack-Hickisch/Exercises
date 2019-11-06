class Pantry
{
  // Instance Variables
  private Jam  jar1 ;
  private Jam  jar2 ;
  private Jam  jar3 ;
  private Jam  selected;

  // Constructors
  Pantry( Jam jar1, Jam jar2, Jam jar3 )
  {
    this.jar1 = jar1 ;
    this.jar2 = jar2 ;
    this.jar3 = jar3 ;
    selected = jar1;
  }

  Pantry( Jam jar1, Jam jar2 )
  {
    this . jar1 = jar1 ;
    this . jar2 = jar2 ;
    this . jar3 = null ;
    selected = jar1;
  }

  Pantry( Jam jar1 )
  {
    this . jar1 = jar1 ;
    this . jar2 = null ;
    this . jar3 = null ;
    selected = jar1;
  }

  // Methods
  public String toString()
  {
    String str = "";
    if (this.jar1 != null && this.jar2 != null && this.jar3 != null)
    {
      str += "1: " +  jar1.toString()  + "\n";
      str += "2: " +  jar2.toString()  + "\n";
      str += "3: " +  jar3.toString()  + "\n";     
      return str;
    }
    else if (this.jar1 != null && this.jar2 != null)
    {
      str += "1: " +  jar1.toString()  + "\n";
      str += "2: " +  jar2.toString()  + "\n";   
      return str;
    }
    else if (this.jar1 != null && this.jar3 != null)
    {
      str += "1: " +  jar1.toString()  + "\n";
      str += "2: " +  jar3.toString()  + "\n";   
      return str;
    }
    else if (this.jar2 != null && this.jar3 != null)
    {
      str += "1: " +  jar2.toString()  + "\n";
      str += "2: " +  jar3.toString()  + "\n";   
      return str;
    }
    return "";
  }

  // assume that the user entered a correct selection, 1, 2, or 3
  public boolean select( int jarNumber )
  {
    if ( jarNumber == 1 )
    {
      this.selected = jar1;
      return true;
    }
    else if ( jarNumber == 2 )
    {
      this.selected = jar2;
      return true;
    }
    else if ( jarNumber == 3)
    {
      this.selected = jar3;
      return true;
    }

    return false;
  }

  // spread the selected jam
  public void spread( int oz )
  {
    selected.spread( oz ) ;
  }

  public void replace(Jam whatReplace, int whereReplace)
  {
    if (whereReplace == 1)
    {
      this.jar1 = whatReplace;
    }

    if (whereReplace == 2)
    {
      this.jar2 = whatReplace;
    }

    if (whereReplace == 3)
    {
      this.jar3 = whatReplace;
    }
  }

  public void mixedFruit()
  {
    if (jar1.getCapacity() < 3 && jar2.getCapacity() < 3 && jar3.getCapacity() < 3)
    jar1 = new Jam( "Mixed Fruit", "7/4/86", 5 );
    jar2 = null;
    jar3 = null;
  }
}