package chapter9;

public class InheritanceTester {

	public static void main(String[] args) {

//		Rectangle rectangle = new Rectangle();
//		rectangle.print();
//		
//		Square square = new Square();
//		square.print("square");
//		
//		square.calculatePerimeter();
//		rectangle.calculatePerimeter();
//		
		Mother mom = new Mother();
		mom.setName("kawthar");
		
		System.out.println(mom.getName() + " is a "+ mom.getGender());
		
//		Employee ex  = new Employee("ddd");
		
	}

}
