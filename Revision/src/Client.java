import java.util.ArrayList;

public class Client {

	public static void main(String[] args) {
		// get area of a rectangle
		IArea r = new Rectangle(3, 4);
		System.out.println(r.getArea());
		// get area of a square
		r = new Square(5);
		System.out.println(r.getArea());
		// get circumferences of a list of shapes
		ArrayList<Shape> l = new ArrayList<>();
		l.add(new Rectangle(3, 4));
		l.add(new Square(5));
		for (Shape shape : l) {
			System.out.println(shape.getCircumference());
		}

	}
}
