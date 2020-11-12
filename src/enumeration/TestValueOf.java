package enumeration;

public class TestValueOf {

	public static void main(String[] args) {

		Restaurants r;
		r = Restaurants.valueOf("dominos");
		System.out.println("It is " + r);

	}

}
