package anonymousClassDemo;

public class AnonymousDemo {

	
	 public void createClass() {

		 /*
	      // creation of anonymous class extending class Polygon
	      Polygon p1 = new Polygon() {
	    	  
	    	  @Override
	         public void display() {
	            System.out.println("Inside an anonymous class.");
	         }
	      };
	      
	      p1.display();
	      
	      */
		 
		// anonymous class implementing interface
	      Polygon_Interface p1 = new Polygon_Interface() {
	    	  @Override
	         public void display() {
	            System.out.println("Inside an anonymous class.");
	         }
	      };
	      p1.display();
	      
	   }
}
