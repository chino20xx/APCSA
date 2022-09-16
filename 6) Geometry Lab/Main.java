class Main {
  public static void main(String[] args) {
    System.out.println("Rectangle perimeter test");
    System.out.println( Rect.perimeter(12,5) );
		System.out.println( Rect.perimeter(131,75) );
		System.out.println( Rect.perimeter(20,25) );
		System.out.println( Rect.perimeter(9,256) );
		System.out.println( Rect.perimeter(36,72) );
		System.out.println( Rect.perimeter(8,6) );
		System.out.println( Rect.perimeter(18,16) + "\n\n");
		
		System.out.println("Trapazoid area test");
		System.out.println( Trap.area( 3, 3, 3) );
		System.out.println( Trap.area( 5, 6, 7) );
		System.out.println( Trap.area( 7, 10, 6) );
		System.out.println( Trap.area( 13, 9, 3) );
		System.out.println( Trap.area( 6, 11, 4) );
		System.out.println( Trap.area( 11, 8, 5) + "\n\n");
		
		System.out.println("Cube area test");
		System.out.println( "Cube area is :: " + Cube.area( 112 ) );
		System.out.println( "Cube area is :: " + Cube.area( 4 ) );
		System.out.println( "Cube area is :: " + Cube.area( 33 ) );
		System.out.println( "Cube area is :: " + Cube.area( 50 ) );
		System.out.println( "Cube area is :: " + Cube.area( 5 ) );		
		System.out.println( "Cube area is :: " + Cube.area( 19 ) );
		System.out.println( "Cube area is :: " + Cube.area( 111 ) + "\n\n");
		
		System.out.println("Circle area test");
		System.out.printf( "Circle area is :: %.2f\n" , Circle.area( 7.5 ) );
		System.out.printf( "Circle area is :: %.2f\n" , Circle.area( 10 ) );
		System.out.printf( "Circle area is :: %.2f\n" , Circle.area( 72.534 ) );
		System.out.printf( "Circle area is :: %.2f\n" , Circle.area( 55 ) );
		System.out.printf( "Circle area is :: %.2f\n" , Circle.area( 101 ) );
		System.out.printf( "Circle area is :: %.2f\n" , Circle.area( 99.952 ) );
		System.out.printf( "Circle area is :: %.2f\n\n\n" , Circle.area( 100 )  );	
		
		System.out.println("Line Slope test");
		System.out.printf( "Slope is :: %.2f\n" , Line.getSlope( 1,9,14,2 ) );
		System.out.printf( "Slope is :: %.2f\n" , Line.getSlope( 1,7,18,3 ) );
		System.out.printf( "Slope is :: %.2f\n" , Line.getSlope( 6,4,2,2 ) );
		System.out.printf( "Slope is :: %.2f\n" , Line.getSlope( 4,4,5,3 ) );
		System.out.printf( "Slope is :: %.2f\n" , Line.getSlope( 1,1,2,9 ) );
		System.out.printf( "Slope is :: %.2f\n" , Line.getSlope( 1,7,2,9 ) );
		
		
  }
}