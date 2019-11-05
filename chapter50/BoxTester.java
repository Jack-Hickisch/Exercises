class BoxTester
{

  public static void main ( String[] args )
  {
     Box box = new  Box( 2.5, 5.0, 6.0 ) ;
     Box oldBox = new Box(box);

     System.out.println( "Area: "  + box.area() + " volume: " + box. volume() );

     System.out.println( "length: " + box.length() + " height: " + box. height() +
                         "width:  " + box.width() )  ;

     System.out.println( "Area: "  + oldBox.area() + " volume: " + oldBox. volume() );

     System.out.println( "length: " + oldBox.length() + " height: " + oldBox. height() +
                         "width:  " + oldBox.width() )  ;

      Box bigger_box = box.biggerBox(box);
      Box smaller_box = box.smallerBox(box);
      
      System.out.println("");

     System.out.println( "Area: "  + bigger_box.area() + " volume: " + bigger_box. volume() );

     System.out.println( "length: " + bigger_box.length() + " height: " + bigger_box. height() +
                         "width:  " + bigger_box.width() )  ;

     System.out.println( "Area: "  + smaller_box.area() + " volume: " + smaller_box. volume() );

     System.out.println( "length: " + smaller_box.length() + " height: " + smaller_box. height() +
                         "width:  " + smaller_box.width() )  ;

      System.out.println(box.nests(bigger_box, smaller_box));
      System.out.println(box.nests(smaller_box, bigger_box));
  }
}